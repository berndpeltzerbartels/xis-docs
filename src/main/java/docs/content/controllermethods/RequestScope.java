package docs.content.controllermethods;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/requestscope.html", containerId = "main")
@Navigation(title = "Request Scope", nextItem = LocalStorageAndFriends.class)
class RequestScope {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
