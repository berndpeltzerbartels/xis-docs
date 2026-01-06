package xis.docs.content.reference;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(value = "ReferenceFrameworkAttributes", url = "/docs/reference/frameworkattributes.html", containerId = "main")
@Navigation(title = "Framework Attributes")
class FrameworkAttributesReference {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
