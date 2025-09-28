package docs.content;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Pages and Widgets", nextItem = TemplateLocation.class)
class PagesAndWidgets {

    @GlobalVariable("title")
    String title() {
        return "Pages and Widgets";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Pages and Widgets";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
