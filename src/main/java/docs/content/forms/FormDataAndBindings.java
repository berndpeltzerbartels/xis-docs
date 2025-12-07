package docs.content.forms;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/formdataandbindings.html", containerId = "main")
@Navigation(title = "Form Data and Bindings", nextItem = FormActions.class)
class FormDataAndBindings {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
