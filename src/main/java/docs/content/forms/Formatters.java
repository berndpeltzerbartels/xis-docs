package docs.content.forms;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Formatters")
class Formatters {

    @GlobalVariable("title")
    String title() {
        return "Formatters";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Forms";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Formatters";
    }
}
