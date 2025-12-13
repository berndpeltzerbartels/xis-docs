package docs.content.xisboot;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/contextannotations.html", containerId = "main")
@Navigation(title = "Context")
public class ContextAnnotations {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
