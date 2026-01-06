package xis.docs.content.reference;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(url = "/docs/reference/xisbootannotations.html", containerId = "main")
@Navigation(title = "Xis-Boot Annotations", nextItem = FrameworkTagsReference.class)
class XisBootAnnotationReference {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
