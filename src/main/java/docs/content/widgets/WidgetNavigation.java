package docs.content.widgets;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Widget Navigation", nextItem = WidgetUpdateEvents.class)
class WidgetNavigation {

    @GlobalVariable("title")
    String title() {
        return "Widget Navigation";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Widget Navigation";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
