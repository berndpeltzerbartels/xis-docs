package xis.docs.content.controllermethods;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/linkaction.html", containerId = "main")
@Navigation(title = "Link Action", nextItem = ActionsForNavigation.class)
class LinkAction {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
