package docs.content.controllermethods;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/linkaction.html", containerId = "main")
@Navigation(title = "Link Action", nextItem = ActionsForNavigation.class)
class LinkAction {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
