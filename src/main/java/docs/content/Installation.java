package docs.content;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/installation.html", containerId = "main")
@Navigation(title = "Installation", nextItem = GradlePlugin.class)
class Installation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
