package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/lifecycle.html", containerId = "main")
@Navigation(title = "Request Lifecycle", nextItem = DeepLinking.class)
public class Lifecycle {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
