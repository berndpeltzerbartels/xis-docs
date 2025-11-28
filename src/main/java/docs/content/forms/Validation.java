package docs.content.forms;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Validation", nextItem = Formatters.class)
class Validation {

    @GlobalVariable("title")
    String title() {
        return "Validation";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Forms";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Validation";
    }
}
