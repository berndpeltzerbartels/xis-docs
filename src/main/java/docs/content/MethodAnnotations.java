package docs.content;

import docs.Navigation;
import docs.content.templatesyntax.TemplateSyntax;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Method Annotations", nextItem = TemplateSyntax.class)
class MethodAnnotations {
    
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
