package docs.content;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Installation", nextItem = GradlePlugin.class)
class Installation {

    @GlobalVariable("title")
    String title() {
        return "Installation";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Installation";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
