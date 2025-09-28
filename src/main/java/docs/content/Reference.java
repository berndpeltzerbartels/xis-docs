package docs.content;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Reference")
public class Reference {

    @GlobalVariable("title")
    String title() {
        return "Reference";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Reference";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
