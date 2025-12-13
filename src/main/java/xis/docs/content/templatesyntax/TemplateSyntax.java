package xis.docs.content.templatesyntax;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.context.XISComponent;
import xis.docs.content.ParameterAnnotations;
import xis.docs.navi.Navigation;

@XISComponent
@Navigation(title = "Template Syntax", nextItem = ParameterAnnotations.class, firstSubItem = Variables.class)
public class TemplateSyntax {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
