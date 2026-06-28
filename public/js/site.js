(function () {
  async function hydrateIncludes() {
    var hosts = document.querySelectorAll("[data-include]");
    await Promise.all(Array.from(hosts).map(async function (host) {
      if (host.textContent.trim().length > 0 || host.children.length > 0) {
        return;
      }
      try {
        var response = await fetch(host.getAttribute("data-include"), { cache: "no-cache" });
        if (response.ok) {
          host.innerHTML = await response.text();
        }
      } catch (error) {
        // SSI should handle production. This fallback only helps local preview.
      }
    }));
  }

  function markActiveLocation() {
    var path = window.location.pathname;
    if (path === "/") {
      path = "/index.html";
    }
    var links = document.querySelectorAll("a[href]");
    links.forEach(function (link) {
      var href = link.getAttribute("href");
      if (href === path) {
        link.classList.add("active");
        link.setAttribute("aria-current", "page");
      }
    });

    var current = document.querySelector("[data-current-page]");
    if (current) {
      var exactSideItems = Array.from(document.querySelectorAll(".side-nav a.active:not(.nav-heading)"));
      var active = exactSideItems[exactSideItems.length - 1]
        || document.querySelector(".side-nav a.active")
        || document.querySelector(".top-nav a.active");
      current.textContent = active ? active.textContent.trim() : document.title.replace(" - XIS", "");
    }
  }

  function escapeHtml(value) {
    return value.replace(/[&<>"']/g, function (char) {
      return {
        "&": "&amp;",
        "<": "&lt;",
        ">": "&gt;",
        "\"": "&quot;",
        "'": "&#39;"
      }[char];
    });
  }

  function normalizeSearchText(value) {
    return value.toLowerCase().replace(/\s+/g, " ").trim();
  }

  function scoreSearchResult(item, terms) {
    var title = normalizeSearchText(item.title);
    var section = normalizeSearchText(item.section || "");
    var text = normalizeSearchText(item.text);
    var score = 0;
    for (var i = 0; i < terms.length; i += 1) {
      var term = terms[i];
      if (!text.includes(term) && !title.includes(term) && !section.includes(term)) {
        return 0;
      }
      if (title.includes(term)) {
        score += 10;
      }
      if (section.includes(term)) {
        score += 6;
      }
      if (text.includes(term)) {
        score += 1;
      }
    }
    return score;
  }

  function excerptFor(item, terms) {
    var text = item.text.replace(/\s+/g, " ").trim();
    var lower = text.toLowerCase();
    var firstIndex = terms.reduce(function (best, term) {
      var index = lower.indexOf(term);
      if (index < 0) {
        return best;
      }
      return best < 0 ? index : Math.min(best, index);
    }, -1);
    var start = Math.max(0, firstIndex - 80);
    var end = Math.min(text.length, start + 180);
    var prefix = start > 0 ? "..." : "";
    var suffix = end < text.length ? "..." : "";
    return prefix + text.slice(start, end) + suffix;
  }

  function renderSearchResults(container, query, index) {
    var terms = normalizeSearchText(query).split(" ").filter(Boolean);
    if (terms.length === 0) {
      container.hidden = true;
      container.innerHTML = "";
      return;
    }

    var results = index
      .map(function (item) {
        return { item: item, score: scoreSearchResult(item, terms) };
      })
      .filter(function (entry) {
        return entry.score > 0;
      })
      .sort(function (left, right) {
        return right.score - left.score || left.item.title.localeCompare(right.item.title);
      })
      .slice(0, 8);

    if (results.length === 0) {
      container.hidden = false;
      container.innerHTML = "<div class=\"search-empty\">No matches</div>";
      return;
    }

    container.hidden = false;
    container.innerHTML = results.map(function (entry) {
      var item = entry.item;
      var label = item.section ? item.title + " / " + item.section : item.title;
      return "<a class=\"search-result\" href=\"" + item.url + "\">"
        + "<strong>" + escapeHtml(label) + "</strong>"
        + "<span>" + escapeHtml(excerptFor(item, terms)) + "</span>"
        + "</a>";
    }).join("");
  }

  async function setupSearch() {
    var form = document.querySelector("[data-search-form]");
    var input = document.querySelector("[data-search-input]");
    var results = document.querySelector("[data-search-results]");
    if (!form || !input || !results) {
      return;
    }

    var searchIndex = [];
    var loaded = false;

    async function ensureIndex() {
      if (loaded) {
        return;
      }
      loaded = true;
      try {
        var response = await fetch("/public/search-index.json", { cache: "no-cache" });
        if (response.ok) {
          searchIndex = await response.json();
        }
      } catch (error) {
        searchIndex = [];
      }
    }

    form.addEventListener("submit", function (event) {
      var firstResult = results.querySelector(".search-result");
      if (firstResult) {
        return;
      }
      event.preventDefault();
    });

    input.addEventListener("input", async function () {
      await ensureIndex();
      renderSearchResults(results, input.value, searchIndex);
    });

    input.addEventListener("focus", async function () {
      await ensureIndex();
      renderSearchResults(results, input.value, searchIndex);
    });

    document.addEventListener("click", function (event) {
      if (!form.contains(event.target)) {
        results.hidden = true;
      }
    });
  }

  function setupCodeCopyButtons() {
    var blocks = document.querySelectorAll("pre");
    blocks.forEach(function (block) {
      if (block.querySelector(".copy-code-button")) {
        return;
      }
      var code = block.querySelector("code");
      if (!code || code.textContent.trim().length === 0) {
        return;
      }

      block.classList.add("copyable-code");
      var button = document.createElement("button");
      button.type = "button";
      button.className = "copy-code-button";
      button.textContent = "Copy";
      button.setAttribute("aria-label", "Copy code example");
      button.addEventListener("click", async function () {
        try {
          await navigator.clipboard.writeText(code.textContent);
          button.textContent = "Copied";
          window.setTimeout(function () {
            button.textContent = "Copy";
          }, 1400);
        } catch (error) {
          button.textContent = "Select";
          window.setTimeout(function () {
            button.textContent = "Copy";
          }, 1800);
        }
      });
      block.appendChild(button);
    });
  }

  hydrateIncludes().then(function () {
    markActiveLocation();
    setupSearch();
    setupCodeCopyButtons();
  });
})();
