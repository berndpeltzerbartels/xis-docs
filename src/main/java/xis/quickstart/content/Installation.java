package xis.quickstart.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(id = "quickstart-installation", url = "/quickstart/installation.html", containerId = "main")
@Navigation(title = "Installation", section = "quickstart", nextItem = MainClass.class)
class Installation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
