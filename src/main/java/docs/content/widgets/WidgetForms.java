package docs.content.widgets;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Forms in Widgets")
public class WidgetForms {

    @GlobalVariable("title")
    String title() {
        return "Forms in Widgets";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Forms in Widgets";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
