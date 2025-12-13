package docs.content.widgets;

import docs.navi.Navigation;
import docs.content.Lifecycle;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/widgetsdetails.html", containerId = "main")
@Navigation(title = "Widget Details", nextItem = Lifecycle.class, firstSubItem = WidgetContainers.class)
public class WidgetsDetails {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
