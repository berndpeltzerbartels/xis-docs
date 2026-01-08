package xis.sitemap;

import lombok.Getter;
import one.xis.Widget;
import one.xis.context.Component;
import one.xis.context.Init;
import one.xis.context.Inject;

import java.util.ArrayList;
import java.util.List;


@Component
class SitemapService {
    @Inject(annotatedWith = Widget.class)
    private List<Object> contentWidgets;

    @Getter
    private List<String> sitemapEntries;

    @Init
    void init() {
        sitemapEntries = new ArrayList<>();
        for (var widget : contentWidgets) {
            Widget widgetAnnotation = widget.getClass().getAnnotation(Widget.class);
            if (!widgetAnnotation.url().isEmpty()) {
                sitemapEntries.add("https://xis.one" + widgetAnnotation.url());
            }
        }
    }
}
