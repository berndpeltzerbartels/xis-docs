package docs.content.controllermethods;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/localstorageandfriends.html", containerId = "main")
@Navigation(title = "Local Storage, Session Storage and State Variables")
class LocalStorageAndFriends {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
