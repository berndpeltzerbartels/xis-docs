package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/templatelocation.html", containerId = "main")
@Navigation(title = "Template Location", nextItem = ClassAnnotations.class)
public class TemplateLocation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
