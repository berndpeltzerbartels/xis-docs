package xis.docs.content.pagesandwidgets;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/pages.html", containerId = "main")
@Navigation(title = "Pages", nextItem = Widgets.class)
class Pages {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
