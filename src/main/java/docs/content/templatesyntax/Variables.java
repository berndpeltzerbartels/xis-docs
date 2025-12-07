package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/variables.html", containerId = "main")
@Navigation(title = "Variables", nextItem = ExpressionLanguage.class)
class Variables {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
