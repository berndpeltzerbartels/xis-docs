package docs.content;

import docs.Navigation;
import docs.content.controllermethods.ControllerMethods;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Request Lifecycle", nextItem = ControllerMethods.class)
public class Lifecycle {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
