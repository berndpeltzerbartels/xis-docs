package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Framework Tags", nextItem = FrameworkAttributes.class)
class FrameworkTags {

    @GlobalVariable("title")
    String title() {
        return "Framework Tags";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Template Syntax";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Framework Tags";
    }
}
