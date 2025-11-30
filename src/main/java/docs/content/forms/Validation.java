package docs.content.forms;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Validation")
class Validation {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
