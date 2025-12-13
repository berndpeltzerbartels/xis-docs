package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/classannotations.html", containerId = "main")
@Navigation(title = "Class Annotations", nextItem = MethodAnnotations.class)
class ClassAnnotations {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
