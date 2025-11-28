package docs.content.controllermethods;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Provide Model Data", nextItem = LinkAction.class)
class ProvideModelData {

    @GlobalVariable("title")
    String title() {
        return "Provide Model Data";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Controller Methods";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Provide Model Data";
    }
}
