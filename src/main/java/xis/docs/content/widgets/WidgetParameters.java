package xis.docs.content.widgets;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/widgetparameters.html", containerId = "main")
@Navigation(title = "Widget Parameters", nextItem = WidgetNavigation.class)
public class WidgetParameters {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
