package docs.content.customizing;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/systemerrors.html", containerId = "main")
@Navigation(title = "System Error Handling")
public class SystemErrors {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
