package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/frameworkattributes.html", containerId = "main")
@Navigation(title = "Framework Attributes", nextItem = CustomElFunctions.class)
class FrameworkAttributes {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
