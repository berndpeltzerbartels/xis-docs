package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Expression Language", nextItem = FrameworkTags.class)
class ExpressionLanguage {

    @GlobalVariable("title")
    String title() {
        return "Expression Language";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Template Syntax";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Expression Language";
    }
}
