package docs.content;

import docs.Navigation;
import docs.content.xisboot.XisBoot;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/gradleplugin.html", containerId = "main")
@Navigation(title = "The Gradle Plugin", nextItem = XisBoot.class)
class GradlePlugin {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
