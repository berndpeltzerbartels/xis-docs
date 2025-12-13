package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.content.security.Security;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/xistheme.html", containerId = "main")
@Navigation(title = "XIS-Theme", nextItem = Security.class)
public class XisTheme {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
