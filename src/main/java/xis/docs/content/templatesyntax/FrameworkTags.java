package xis.docs.content.templatesyntax;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/frameworktags.html", containerId = "main")
@Navigation(title = "Framework Tags", nextItem = FrameworkAttributes.class)
class FrameworkTags {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
