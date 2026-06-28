# XIS docs

## Search index

Regenerate the client-side search index after changing documentation pages:

```bash
node scripts/build-search-index.mjs
```

The script scans the public HTML pages and writes `public/search-index.json`.
It skips internal includes, public assets, and `docs-internal`.
