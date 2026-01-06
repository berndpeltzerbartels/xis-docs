package xis.docs.content.reference;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(value = "ReferenceParameterAnnotations", url = "/docs/reference/parameterannotations.html", containerId = "main")
@Navigation(title = "Parameter Annotations", nextItem = FieldAnnotationReference.class)
class ParameterAnnotationReference {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
