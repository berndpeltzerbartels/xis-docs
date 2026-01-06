package xis.docs.content.reference;


import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.content.ParameterAnnotations;
import xis.navi.Navigation;


@Widget(value = "ReferenceMethodAnnotations", url = "/docs/reference/methodannotations.html", containerId = "main")
@Navigation(title = "Method Annotations", nextItem = ParameterAnnotationReference.class)
class MethodAnnotationReference {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
