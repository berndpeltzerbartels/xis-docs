package xis.docs.content.templatesyntax;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/customelfunctions.html", containerId = "main")
@Navigation(title = "Custom EL Functions", nextItem = FrameworkTags.class)
class CustomElFunctions {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
