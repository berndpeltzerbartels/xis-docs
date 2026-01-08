package xis.docs.content.templatesyntax;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(url = "/docs/variables.html", containerId = "main")
@Navigation(title = "Variables", nextItem = FrameworkVariables.class)
class Variables {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
