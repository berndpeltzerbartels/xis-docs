package docs.content;

import docs.navi.Navigation;
import docs.content.templatesyntax.TemplateSyntax;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/methodannotations.html", containerId = "main")
@Navigation(title = "Method Annotations", nextItem = TemplateSyntax.class)
class MethodAnnotations {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
