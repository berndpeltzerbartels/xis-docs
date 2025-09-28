package docs.content.security;

import docs.Navigation;
import docs.content.Reference;
import one.xis.GlobalVariable;
import one.xis.context.XISComponent;

@XISComponent
@Navigation(title = "Security", firstSubItem = RolesAnnotation.class, nextItem = Reference.class)
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
