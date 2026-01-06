package xis.docs.content.reference;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(value = "ReferenceFrameworkTags", url = "/docs/reference/frameworktags.html", containerId = "main")
@Navigation(title = "Framework Tags")
class FrameworkTagsReference {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
