package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Custom EL Functions")
class CustomElFunctions {

    @GlobalVariable("title")
    String title() {
        return "Custom EL Functions";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Template Syntax";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Custom EL Functions";
    }
}
