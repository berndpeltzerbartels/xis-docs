package docs.content.controllermethods;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Request Scope", nextItem = LocalStorageAndFriends.class)
class RequestScope {

    @GlobalVariable("title")
    String title() {
        return "Request Scope";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Controller Methods";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Request Scope";
    }
}
