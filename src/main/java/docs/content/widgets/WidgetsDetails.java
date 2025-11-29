package docs.content.widgets;

import docs.Navigation;
import docs.content.Lifecycle;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Widget Details", nextItem = Lifecycle.class, firstSubItem = WidgetContainers.class)
public class WidgetsDetails {

    @GlobalVariable("title")
    String title() {
        return "Widget Details";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Widget Details";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
