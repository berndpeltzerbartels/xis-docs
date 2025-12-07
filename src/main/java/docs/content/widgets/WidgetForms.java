package docs.content.widgets;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/widgetforms.html", containerId = "main")
@Navigation(title = "Forms in Widgets")
public class WidgetForms {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
