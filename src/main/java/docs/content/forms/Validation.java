package docs.content.forms;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/validation.html", containerId = "main")
@Navigation(title = "Validation")
class Validation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
