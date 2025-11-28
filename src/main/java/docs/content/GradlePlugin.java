package docs.content;

import docs.Navigation;
import docs.content.pagesandwidgets.PagesAndWidgets;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "The Gradle Plugin", nextItem = PagesAndWidgets.class)
class GradlePlugin {

    @GlobalVariable("title")
    String title() {
        return "The Gradle Plugin";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "The Gradle Plugin";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
