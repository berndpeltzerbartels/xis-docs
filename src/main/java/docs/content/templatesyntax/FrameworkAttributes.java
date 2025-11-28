package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Framework Attributes", nextItem = CustomElFunctions.class)
class FrameworkAttributes {

    @GlobalVariable("title")
    String title() {
        return "Framework Attributes";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Template Syntax";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Framework Attributes";
    }
}
