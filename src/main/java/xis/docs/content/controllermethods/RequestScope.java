package xis.docs.content.controllermethods;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/requestscope.html", containerId = "main")
@Navigation(title = "Request Scope", nextItem = LocalStorageAndFriends.class)
class RequestScope {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
