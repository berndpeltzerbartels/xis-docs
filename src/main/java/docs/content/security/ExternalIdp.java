package docs.content.security;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "External Identity Provider For Authentication", nextItem = XisExternalIdp.class)
class ExternalIdp {

    @GlobalVariable("title")
    String title() {
        return "External Identity Provider For Authentication";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Security";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "External Identity Provider For Authentication";
    }
}
