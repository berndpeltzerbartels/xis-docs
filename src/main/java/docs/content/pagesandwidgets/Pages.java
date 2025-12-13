package docs.content.pagesandwidgets;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/pages.html", containerId = "main")
@Navigation(title = "Pages", nextItem = Widgets.class)
class Pages {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
