package xis.docs.content.widgets;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/widgetupdateevents.html", containerId = "main")
@Navigation(title = "Update Events", nextItem = WidgetForms.class)
public class WidgetUpdateEvents {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
