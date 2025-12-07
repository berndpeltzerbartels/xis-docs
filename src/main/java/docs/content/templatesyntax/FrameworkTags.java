package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/frameworktags.html", containerId = "main")
@Navigation(title = "Framework Tags", nextItem = FrameworkAttributes.class)
class FrameworkTags {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
