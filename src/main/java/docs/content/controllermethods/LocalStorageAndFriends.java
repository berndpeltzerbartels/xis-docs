package docs.content.controllermethods;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Local Storage, Session Storage and State Variables")
class LocalStorageAndFriends {

    @GlobalVariable("title")
    String title() {
        return "Local Storage, Session Storage and State Variables";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Controller Methods";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Local Storage, Session Storage and State Variables";
    }
}
