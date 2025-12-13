package xis.docs.content.templatesyntax;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/variables.html", containerId = "main")
@Navigation(title = "Variables", nextItem = ExpressionLanguage.class)
class Variables {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
