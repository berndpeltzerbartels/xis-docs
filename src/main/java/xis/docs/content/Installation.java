package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/installation.html", containerId = "main")
@Navigation(title = "Installation", nextItem = GradlePlugin.class)
class Installation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
