package docs.content.widgets;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/widgetparameters.html", containerId = "main")
@Navigation(title = "Widget Parameters", nextItem = WidgetNavigation.class)
public class WidgetParameters {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
