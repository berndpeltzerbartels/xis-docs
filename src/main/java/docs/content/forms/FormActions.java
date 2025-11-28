package docs.content.forms;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Form Actions", nextItem = Validation.class)
class FormActions {

    @GlobalVariable("title")
    String title() {
        return "Form Actions";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Forms";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Form Actions";
    }
}
