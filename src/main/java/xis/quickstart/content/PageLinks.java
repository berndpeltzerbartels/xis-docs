package xis.quickstart.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(id = "quickstart-pagelinks", url = "/quickstart/pagelinks.html", containerId = "main")
@Navigation(title = "Page Links", section = "quickstart")
class PageLinks {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
