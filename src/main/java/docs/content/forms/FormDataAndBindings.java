package docs.content.forms;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Form Data and Bindings", nextItem = Selectboxes.class)
class FormDataAndBindings {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
