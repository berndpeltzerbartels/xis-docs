package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/formatters.html", containerId = "main")
@Navigation(title = "Formatters", nextItem = XisTheme.class)
public class Formatters {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
