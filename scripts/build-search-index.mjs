#!/usr/bin/env node

import { readdir, readFile, writeFile } from "node:fs/promises";
import path from "node:path";

const root = path.resolve(new URL("..", import.meta.url).pathname);
const outputFile = path.join(root, "public", "search-index.json");
const ignoredDirs = new Set([".git", "includes", "public", "docs-internal"]);

async function findHtmlFiles(dir) {
  const entries = await readdir(dir, { withFileTypes: true });
  const files = [];
  for (const entry of entries) {
    if (entry.name.startsWith(".")) {
      continue;
    }
    const fullPath = path.join(dir, entry.name);
    if (entry.isDirectory()) {
      if (!ignoredDirs.has(path.relative(root, fullPath).split(path.sep)[0])) {
        files.push(...await findHtmlFiles(fullPath));
      }
    } else if (entry.isFile() && entry.name.endsWith(".html")) {
      files.push(fullPath);
    }
  }
  return files;
}

function decodeHtml(value) {
  return value
    .replace(/&nbsp;/g, " ")
    .replace(/&amp;/g, "&")
    .replace(/&lt;/g, "<")
    .replace(/&gt;/g, ">")
    .replace(/&quot;/g, "\"")
    .replace(/&#39;/g, "'")
    .replace(/&#x27;/g, "'")
    .replace(/&#(\d+);/g, (_, code) => String.fromCharCode(Number(code)))
    .replace(/&#x([0-9a-f]+);/gi, (_, code) => String.fromCharCode(parseInt(code, 16)));
}

function stripHtml(html) {
  return decodeHtml(html
    .replace(/<script\b[\s\S]*?<\/script>/gi, " ")
    .replace(/<style\b[\s\S]*?<\/style>/gi, " ")
    .replace(/<[^>]+>/g, " ")
    .replace(/\s+/g, " ")
    .trim());
}

function firstMatch(html, pattern) {
  const match = html.match(pattern);
  return match ? stripHtml(match[1]) : "";
}

function toUrl(file) {
  return `/${path.relative(root, file).split(path.sep).join("/")}`;
}

function sectionFor(html, title) {
  const breadcrumb = firstMatch(html, /<div[^>]*class=["'][^"']*\bbreadcrumb\b[^"']*["'][^>]*>([\s\S]*?)<\/div>/i);
  if (breadcrumb) {
    return breadcrumb;
  }
  const parts = title.split(" - ").map((part) => part.trim()).filter(Boolean);
  return parts.length > 1 ? parts.slice(1).join(" / ") : "";
}

async function buildIndex() {
  const files = (await findHtmlFiles(root)).sort();
  const index = [];
  for (const file of files) {
    const html = await readFile(file, "utf8");
    const h1 = firstMatch(html, /<h1[^>]*>([\s\S]*?)<\/h1>/i);
    const title = h1 || firstMatch(html, /<title[^>]*>([\s\S]*?)<\/title>/i) || toUrl(file);
    const section = sectionFor(html, title);
    const text = stripHtml(html);
    if (!text) {
      continue;
    }
    index.push({
      url: toUrl(file),
      title,
      section,
      text
    });
  }
  await writeFile(outputFile, `${JSON.stringify(index, null, 2)}\n`, "utf8");
  console.log(`Wrote ${index.length} entries to ${path.relative(root, outputFile)}`);
}

buildIndex().catch((error) => {
  console.error(error);
  process.exit(1);
});
