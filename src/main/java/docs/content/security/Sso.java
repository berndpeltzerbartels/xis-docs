package docs.content.security;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Single Sign-On (SSO)")
class Sso {

    @GlobalVariable("title")
    String title() {
        return "Single Sign-On (SSO)";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Security";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Single Sign-On (SSO)";
    }

}
