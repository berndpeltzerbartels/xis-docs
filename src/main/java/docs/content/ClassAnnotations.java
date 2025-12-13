package docs.content;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/classannotations.html", containerId = "main")
@Navigation(title = "Class Annotations", nextItem = MethodAnnotations.class)
class ClassAnnotations {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
