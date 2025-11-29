package docs.content.widgets;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Widget Parameters", nextItem = WidgetNavigation.class)
public class WidgetParameters {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
