# XIS Documentation Structure Draft

The static site has been started. The previous XIS application is no longer the implementation target; it was only a
design reference. The current structure is represented by the HTML pages under `docs/` and the navigation include under
`includes/site-sidebar.html`.

## Core Decisions

- Static HTML, crawlable by search engines.
- Apache is the preferred gateway because SSI, static files, reverse proxying, and later classic web-server features fit
  naturally.
- SSI includes are used for shared navigation. `public/js/site.js` also provides a fetch fallback for local preview.
- The navigation marks the current page with JavaScript.
- Tests are part of the beginner path. The first application page already points to testing instead of postponing tests
  to a late chapter.
- Code examples should later come from executable documentation example projects.

## High-Level Chapters

1. What XIS is.
2. First application.
3. Testing from the start.
4. Runtime model.
5. Pages and templates.
6. Forms, validation, and modal forms.
7. Actions, navigation, responses, routers, and modals.
8. Request lifecycle and refresh events.
9. Frontlets, composition, reuse, and theme.
10. SQL.
11. MongoDB.
12. Security.
13. Distributed and microfrontend architecture.
14. HTTP Controller API.
15. Cloud native and native images.
16. Scheduled jobs.
17. Gradle plugin and tooling.
18. Language support.
19. Extension points.
20. Reference and coverage checklist.
