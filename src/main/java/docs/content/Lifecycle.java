package docs.content;

import docs.Navigation;
import docs.content.controllermethods.ControllerMethods;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget
@Navigation(title = "Request Lifecycle", nextItem = ControllerMethods.class)
public class Lifecycle {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
