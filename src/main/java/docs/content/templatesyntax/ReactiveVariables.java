package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Reactive Variables", nextItem = ExpressionLanguage.class)
class ReactiveVariables {

    @GlobalVariable("title")
    String title() {
        return "Reactive Variables";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Template Syntax";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Reactive Variables";
    }
}
