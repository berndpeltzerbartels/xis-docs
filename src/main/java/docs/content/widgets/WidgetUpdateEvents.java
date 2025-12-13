package docs.content.widgets;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/widgetupdateevents.html", containerId = "main")
@Navigation(title = "Update Events", nextItem = WidgetForms.class)
public class WidgetUpdateEvents {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
