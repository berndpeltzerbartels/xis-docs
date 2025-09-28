package docs.content.security;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Local Authentication", nextItem = ExternalIdp.class)
class LocalAuthentication {

    @GlobalVariable("title")
    String title() {
        return "Local Authentication";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Security";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Local Authentication";
    }
}

