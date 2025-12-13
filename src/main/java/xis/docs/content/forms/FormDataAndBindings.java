package xis.docs.content.forms;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/formdataandbindings.html", containerId = "main")
@Navigation(title = "Form Data and Bindings", nextItem = FormActions.class)
class FormDataAndBindings {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
