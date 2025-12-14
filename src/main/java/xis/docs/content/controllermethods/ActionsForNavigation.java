package xis.docs.content.controllermethods;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/actionsfornavigation.html", containerId = "main")
@Navigation(title = "Actions for Navigation", nextItem = LocalStorageAndFriends.class)
class ActionsForNavigation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
