package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.content.widgets.WidgetsDetails;
import xis.docs.navi.Navigation;

@Widget(url = "/parameterannotations.html", containerId = "main")
@Navigation(title = "Parameter Annotations", nextItem = WidgetsDetails.class)
public class ParameterAnnotations {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
