package docs.content.forms;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Form Data and Bindings", nextItem = Selectboxes.class)
class FormDataAndBindings {

    @GlobalVariable("title")
    String title() {
        return "Form Data and Bindings";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Forms";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Form Data and Bindings";
    }
}
