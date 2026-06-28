# Documentation Review Notes

This file records local review findings while the static documentation is being finished. It is not deployed content.

## Heading Coverage

The current static site includes the full `docs/user` documentation as HTML under `docs/guide/`. That means the current
README topics are covered at least once at detail level:

- runtime and dependencies
- quickstart
- template location and mapping
- core model
- annotations
- template syntax
- tags and attributes
- request lifecycle
- navigation and responses
- routers
- forms and validation
- modals
- drag and drop
- events
- SQL
- MongoDB
- scheduled jobs
- security
- examples and tests
- Gradle plugin
- cloud native/native images
- Groovy
- Kotlin
- advanced topics: microfrontends, reusable web artifacts, aspects, custom proxies, explicit SQL transactions, custom JavaScript, integration-test browser model, theme, advanced refresh events

The book-style chapters are the layer that still needs editorial strengthening. They should explain the why and the
mental model, while the complete guide preserves the full examples and reference detail.

## Fixed In This Pass

- Removed the placeholder-style "Topics for this chapter" section from `Pages and templates`.
- Replaced "navigation without full page reloads where possible" with a stronger statement: XIS avoids browser full page
  reloads and performs page transitions by DOM replacement in the live XIS runtime.
- Added XIS Boot cloud-native/native-image support directly to `Choosing between XIS Boot and Spring`.
- Added variable scope rules for pages, frontlets, includes, inherited frontlet parameters, and explicit override.
- Added a visual lifecycle step flow in `Request lifecycle`.
- Added a shop product page example for frontlets as both UI composition and team boundary.
- Expanded `Testing from the start` with generated tests, hand-written `@XisBootTest`, manual `IntegrationTestContext`,
  document interaction, and a clear comparison of the three testing styles.
- Reviewed the front-facing HTML pages for missing code examples. Every non-guide HTML chapter now has at least one
  code block; practical chapters such as forms, actions, events, SQL, MongoDB, security, custom JavaScript, HTTP
  controllers, Gradle, cloud native, scheduled jobs, language support, and extension points received concrete examples.
- Clarified explicit SQL transaction examples: `transaction.begin()` in an HTTP request is committed at request end, and
  the guide now also shows explicit early `commit()` / `rollback()`.

## Review Rule Added

Do not only compare README examples against the generated `Complete Guide`. That proves that the reference layer has the
examples, but it does not prove that the front-facing book chapters are useful enough. Introductory chapters should be
reviewed for example density separately. A chapter that introduces a practical programming concept should normally show
at least one code example or point immediately to the concrete guide page where the code appears. An HTML page with no
code blocks is a review smell. It may still be acceptable for a pure overview, but that decision should be deliberate
rather than accidental.

## Good Candidates For Draw.io Diagrams

1. XIS request lifecycle.
   Show browser event -> XIS request -> controller/action -> server-rendered result -> DOM replacement. This should make
   clear that even page transitions are DOM updates, not browser reloads.

2. Product page with frontlets.
   Central product page with product id path variable, surrounded by frontlets: description/catalog, delivery and
   discounts, stock/pickup/notification, add-to-cart. Show different teams or systems behind the frontlets.

3. Variable scope and overriding.
   Parent page/frontlet scope flowing into includes and nested frontlets, with explicit frontlet parameter overriding an
   inherited parameter.

4. XIS Boot versus Spring versus HTTP Controller API.
   Decision diagram: existing Spring app -> XIS Spring; standalone app -> XIS Boot; native/small deployable service ->
   XIS Boot Native; raw endpoints/static app -> HTTP Controller API.

5. Microfrontend distribution.
   Shell loads local config, discovers remote configs, merges page/frontlet metadata, then routes later XIS requests to
   the owning host.

## Remaining Editorial Risks

- The generated `Complete Guide` preserves examples and detail, but some generated HTML headings are mechanically
  shifted from Markdown. It is complete enough for crawlability and reference use, but not yet as polished as the
  front-facing book chapters.
- The lifecycle is now more visual, but a real diagram would be clearer than text boxes.
- The frontlet/product example should eventually get one small executable example project, so the code shown in final
  documentation cannot drift.
