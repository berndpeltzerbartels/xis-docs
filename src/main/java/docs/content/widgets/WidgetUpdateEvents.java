package docs.content.widgets;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Update Events", nextItem = WidgetForms.class)
class WidgetUpdateEvents {

    @GlobalVariable("title")
    String title() {
        return "Widget Update Events";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Widget Update Events";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
