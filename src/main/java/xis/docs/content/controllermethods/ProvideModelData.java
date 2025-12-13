package xis.docs.content.controllermethods;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/providemodeldata.html", containerId = "main")
@Navigation(title = "Provide Model Data", nextItem = LinkAction.class)
class ProvideModelData {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
