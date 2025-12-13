package xis.docs.content.xisboot;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/mainclass.html", containerId = "main")
@Navigation(title = "Main Class", nextItem = ContextAnnotations.class)
public class MainClass {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
