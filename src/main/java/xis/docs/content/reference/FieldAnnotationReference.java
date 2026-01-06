package xis.docs.content.reference;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(value = "ReferenceFieldAnnotations", url = "/docs/reference/fieldannotations.html", containerId = "main")
@Navigation(title = "Field Annotations", nextItem = XisBootAnnotationReference.class)
class FieldAnnotationReference {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
