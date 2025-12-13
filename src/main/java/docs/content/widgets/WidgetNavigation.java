package docs.content.widgets;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/widgetnavigation.html", containerId = "main")
@Navigation(title = "Widget Navigation", nextItem = WidgetUpdateEvents.class)
public class WidgetNavigation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
