package docs.content;

import docs.Navigation;
import docs.content.widgets.WidgetsDetails;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Parameter Annotations", nextItem = WidgetsDetails.class)
public class ParameterAnnotations {

    @GlobalVariable("title")
    String title() {
        return "Parameter Annotations";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Parameter Annotations";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
