package docs.content.controllermethods;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Actions for Navigation", nextItem = RequestScope.class)
class ActionsForNavigation {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
