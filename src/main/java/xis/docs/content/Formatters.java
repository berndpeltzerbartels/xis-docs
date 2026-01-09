package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.content.xisdeserialize.XisDeserialize;
import xis.navi.Navigation;

@Widget(url = "/docs/formatters.html", containerId = "main")
@Navigation(title = "Formatters", nextItem = XisDeserialize.class)
public class Formatters {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
