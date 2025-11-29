package docs.content;

import docs.Navigation;
import docs.content.controllermethods.ControllerMethods;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Request Lifecycle", nextItem = ControllerMethods.class)
public class Lifecycle {

    @GlobalVariable("title")
    String title() {
        return "Request Lifecycle";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Request Lifecycle";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
