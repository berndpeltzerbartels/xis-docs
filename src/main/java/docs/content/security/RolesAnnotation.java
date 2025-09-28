package docs.content.security;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Roles Annotation", nextItem = LocalAuthentication.class)
class RolesAnnotation {

    @GlobalVariable("title")
    String title() {
        return "Roles Annotation";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Security";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Roles Annotation";
    }
}
