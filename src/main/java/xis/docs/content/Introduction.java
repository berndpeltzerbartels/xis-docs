package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/introduction.html", containerId = "main")
@Navigation(title = "Introduction", nextItem = WhyXis.class)
class Introduction {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
