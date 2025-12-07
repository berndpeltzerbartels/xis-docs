package docs.content.xisboot;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/mainclass.html", containerId = "main")
@Navigation(title = "Main Class", nextItem = ContextAnnotations.class)
public class MainClass {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
