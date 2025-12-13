package docs.content.controllermethods;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/actionsfornavigation.html", containerId = "main")
@Navigation(title = "Actions for Navigation", nextItem = RequestScope.class)
class ActionsForNavigation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
