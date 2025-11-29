package docs.content.widgets;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Widget Containers", nextItem = WidgetParameters.class)
public class WidgetContainers {

    @GlobalVariable("title")
    String title() {
        return "Widget Containers";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Widget Containers";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
