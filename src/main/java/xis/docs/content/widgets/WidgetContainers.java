package xis.docs.content.widgets;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/widgetcontainers.html", containerId = "main")
@Navigation(title = "Widget Containers", nextItem = WidgetParameters.class)
public class WidgetContainers {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
