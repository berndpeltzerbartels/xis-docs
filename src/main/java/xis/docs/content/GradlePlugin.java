package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(url = "/docs/gradleplugin.html", containerId = "main")
@Navigation(title = "The Gradle Plugin")
public class GradlePlugin {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
