package xis.docs.content.forms;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/formactions.html", containerId = "main")
@Navigation(title = "Form Actions", nextItem = Validation.class)
class FormActions {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
