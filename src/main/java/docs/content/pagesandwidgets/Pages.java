package docs.content.pagesandwidgets;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Pages", nextItem = Widgets.class)
class Pages {

    @GlobalVariable("title")
    String title() {
        return "Pages";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Pages";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
