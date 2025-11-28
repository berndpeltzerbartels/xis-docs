package docs.content.pagesandwidgets;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Widgets")
class Widgets {

    @GlobalVariable("title")
    String title() {
        return "Widgets";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Widgets";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
