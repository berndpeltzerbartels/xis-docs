package xis.docs.content.xisboot;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/xis-installation.html", containerId = "main")
@Navigation(title = "Installation", nextItem = MainClass.class)
class XisBootInstallation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
