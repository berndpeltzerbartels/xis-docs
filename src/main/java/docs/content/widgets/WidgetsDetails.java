package docs.content.widgets;

import docs.Navigation;
import docs.content.Lifecycle;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Widget Details", nextItem = Lifecycle.class, firstSubItem = WidgetContainers.class)
public class WidgetsDetails {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
