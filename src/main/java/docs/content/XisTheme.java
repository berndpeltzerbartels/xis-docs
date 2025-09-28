package docs.content;

import docs.Navigation;
import docs.content.security.Security;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "XIS-Theme", nextItem = Security.class)
public class XisTheme {

    @GlobalVariable("title")
    String title() {
        return "XIS-Theme";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "XIS-Theme";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
