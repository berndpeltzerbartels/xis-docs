package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.content.xisboot.XisBoot;
import xis.docs.navi.Navigation;

@Widget(url = "/gradleplugin.html", containerId = "main")
@Navigation(title = "The Gradle Plugin", nextItem = XisBoot.class)
class GradlePlugin {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
