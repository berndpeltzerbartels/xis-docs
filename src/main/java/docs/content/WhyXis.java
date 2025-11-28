package docs.content;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Why Xis?", nextItem = HelloWorld.class)
class WhyXis {

    @GlobalVariable("title")
    String title() {
        return "Why Xis?";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Why Xis?";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
