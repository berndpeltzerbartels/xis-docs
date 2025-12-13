package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/microfrontendarchitecture.html", containerId = "main")
@Navigation(title = "Micro-Frontend Architecture", nextItem = Reference.class)
public class MicroFrontendArchitecture {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
