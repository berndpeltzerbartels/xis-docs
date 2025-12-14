package xis.docs.content.controllermethods;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/localstorageandfriends.html", containerId = "main")
@Navigation(title = "Client-Side Storage")
class LocalStorageAndFriends {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
