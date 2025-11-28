package docs.content.templatesyntax;

import docs.Navigation;
import docs.content.ParameterAnnotations;
import one.xis.GlobalVariable;
import one.xis.context.XISComponent;

@XISComponent
@Navigation(title = "Template Syntax", nextItem = ParameterAnnotations.class, firstSubItem = Variables.class)
public class TemplateSyntax {

    @GlobalVariable("title")
    String title() {
        return "Template Syntax";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Template Syntax";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
