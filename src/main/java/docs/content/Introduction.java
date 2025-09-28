package docs.content;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Introduction", nextItem = WhyXis.class)
class Introduction {

    @GlobalVariable("title")
    String title() {
        return "Introduction";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Introduction";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
