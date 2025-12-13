package docs.content;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/whyxis.html", containerId = "main")
@Navigation(title = "Why XIS?", nextItem = HelloWorld.class)
class WhyXis {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
