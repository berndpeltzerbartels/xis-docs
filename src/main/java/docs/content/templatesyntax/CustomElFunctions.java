package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/customelfunctions.html", containerId = "main")
@Navigation(title = "Custom EL Functions")
class CustomElFunctions {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
