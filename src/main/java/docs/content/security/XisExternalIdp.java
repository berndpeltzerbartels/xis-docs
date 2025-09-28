package docs.content.security;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Create An Identity Provider Wth XIS", nextItem = Sso.class)
class XisExternalIdp {

    @GlobalVariable("title")
    String title() {
        return "Create An Identity Provider Wth XIS";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Security";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Create An Identity Provider Wth XIS";
    }
}
