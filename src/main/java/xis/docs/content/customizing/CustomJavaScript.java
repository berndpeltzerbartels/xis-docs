package xis.docs.content.customizing;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/customjavascript.html", containerId = "main")
@Navigation(title = "Adding JavaScript", nextItem = SelectableHighlighting.class)
public class CustomJavaScript {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
