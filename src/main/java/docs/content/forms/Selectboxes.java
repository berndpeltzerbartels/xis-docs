package docs.content.forms;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Selectboxes", nextItem = FormActions.class)
class Selectboxes {

    @GlobalVariable("title")
    String title() {
        return "Selectboxes";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Forms";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return "Selectboxes";
    }
}
