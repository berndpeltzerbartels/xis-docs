package xis.docs.content.reference;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(value = "ReferenceClassAnnotations", url = "/docs/reference/classannotations.html", containerId = "main")
@Navigation(title = "Class Annotations", nextItem = MethodAnnotationReference.class)
class ClassAnnotationReference {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
