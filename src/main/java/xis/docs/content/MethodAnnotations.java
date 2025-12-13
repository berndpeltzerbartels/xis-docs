package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.content.templatesyntax.TemplateSyntax;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/methodannotations.html", containerId = "main")
@Navigation(title = "Method Annotations", nextItem = TemplateSyntax.class)
class MethodAnnotations {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
