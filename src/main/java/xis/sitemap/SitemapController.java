package xis.sitemap;


import lombok.RequiredArgsConstructor;
import one.xis.http.ContentType;
import one.xis.http.Controller;
import one.xis.http.Get;
import one.xis.http.Produces;


@Controller
@RequiredArgsConstructor
class SitemapController {

    private final SitemapService sitemapService;

    @Produces(ContentType.TEXT_PLAIN)
    @Get("/sitemap.txt")
    String sitemap() {
        return String.join("\n", sitemapService.getSitemapEntries());
    }

}
