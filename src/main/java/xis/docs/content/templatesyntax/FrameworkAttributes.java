package xis.docs.content.templatesyntax;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/frameworkattributes.html", containerId = "main")
@Navigation(title = "Framework Attributes", nextItem = CustomElFunctions.class)
class FrameworkAttributes {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
