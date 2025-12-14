package xis.docs.content.templatesyntax;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/framework-variables.html", containerId = "main")
@Navigation(title = "Framework Variables", nextItem = CustomElFunctions.class)
class FrameworkVariables {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
