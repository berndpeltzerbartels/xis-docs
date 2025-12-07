package docs.content.forms;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/formactions.html", containerId = "main")
@Navigation(title = "Form Actions", nextItem = Validation.class)
class FormActions {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
