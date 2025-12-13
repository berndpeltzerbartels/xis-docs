package xis.docs.content.customizing;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/systemerrors.html", containerId = "main")
@Navigation(title = "System Error Handling")
public class SystemErrors {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
