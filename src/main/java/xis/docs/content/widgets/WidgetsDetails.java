package xis.docs.content.widgets;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.content.Lifecycle;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/widgetsdetails.html", containerId = "main")
@Navigation(title = "Widget Details", nextItem = Lifecycle.class, firstSubItem = WidgetContainers.class)
public class WidgetsDetails {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
