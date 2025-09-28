package docs.content;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Template Location", nextItem = HelloWorld.class)
class TemplateLocation {

    @GlobalVariable("title")
    String title() {
        return "Template Location";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Template Location";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
