package docs.content.controllermethods;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Actions for Navigation", nextItem = RequestScope.class)
class ActionsForNavigation {

    @GlobalVariable("title")
    String title() {
        return "Actions for Navigation";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Controller Methods";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Actions for Navigation";
    }
}
