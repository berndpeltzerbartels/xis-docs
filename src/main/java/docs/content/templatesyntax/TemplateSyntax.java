package docs.content.templatesyntax;

import docs.Navigation;
import docs.content.ParameterAnnotations;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.context.XISComponent;

@XISComponent
@Navigation(title = "Template Syntax", nextItem = ParameterAnnotations.class, firstSubItem = Variables.class)
public class TemplateSyntax {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
