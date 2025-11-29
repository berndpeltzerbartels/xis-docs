package docs.content;

import docs.Navigation;
import docs.content.widgets.WidgetsDetails;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Parameter Annotations", nextItem = WidgetsDetails.class)
public class ParameterAnnotations {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
