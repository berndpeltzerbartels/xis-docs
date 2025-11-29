package docs.content.widgets;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Widget Parameters", nextItem = WidgetNavigation.class)
public class WidgetParameters {

    @GlobalVariable("title")
    String title() {
        return "Widget Parameters";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Widget Parameters";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
