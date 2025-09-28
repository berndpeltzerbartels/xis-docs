package docs.content;

import docs.Navigation;
import docs.content.controllermethods.ControllerMethods;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Widget Details", nextItem = ControllerMethods.class)
class WidgetsDetails {

    @GlobalVariable("title")
    String title() {
        return "Widget Details";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Widget Details";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
