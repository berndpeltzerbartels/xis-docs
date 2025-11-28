package docs.content.controllermethods;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Link Action", nextItem = ActionsForNavigation.class)
class LinkAction {
    
    @GlobalVariable("title")
    String title() {
        return "Link Action";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Controller Methods";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Link Action";
    }
}
