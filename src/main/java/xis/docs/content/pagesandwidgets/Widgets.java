package xis.docs.content.pagesandwidgets;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/widgets.html", containerId = "main")
@Navigation(title = "Widgets", nextItem = Includes.class)
class Widgets {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
