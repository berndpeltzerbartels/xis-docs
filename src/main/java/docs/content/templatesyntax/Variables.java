package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Variables", nextItem = ReactiveVariables.class)
class Variables {

    @GlobalVariable("title")
    String title() {
        return "Variables";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Variables";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Variables";
    }
}
