package docs.content.controllermethods;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Request Scope", nextItem = LocalStorageAndFriends.class)
class RequestScope {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
