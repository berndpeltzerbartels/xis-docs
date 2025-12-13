package xis.docs.content.widgets;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/widgetnavigation.html", containerId = "main")
@Navigation(title = "Widget Navigation", nextItem = WidgetUpdateEvents.class)
public class WidgetNavigation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
