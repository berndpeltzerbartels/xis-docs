package docs.content;

import docs.Navigation;
import docs.content.pagesandwidgets.PagesAndWidgets;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget
@Navigation(title = "The Gradle Plugin", nextItem = PagesAndWidgets.class)
class GradlePlugin {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
