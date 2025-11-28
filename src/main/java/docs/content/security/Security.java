package docs.content.security;

import docs.Navigation;
import docs.content.MicroFrontendArchitecture;
import docs.content.security.RolesAnnotation;
import one.xis.GlobalVariable;
import one.xis.context.XISComponent;

@XISComponent
@Navigation(title = "Security", firstSubItem = RolesAnnotation.class, nextItem = MicroFrontendArchitecture.class)
public class Security {

    @GlobalVariable("title")
    String title() {
        return "Security";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Security";
    }
}
