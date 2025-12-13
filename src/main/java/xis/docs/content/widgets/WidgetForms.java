package xis.docs.content.widgets;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/widgetforms.html", containerId = "main")
@Navigation(title = "Forms in Widgets")
public class WidgetForms {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
