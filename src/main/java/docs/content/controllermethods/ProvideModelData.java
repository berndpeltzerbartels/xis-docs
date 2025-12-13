package docs.content.controllermethods;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/providemodeldata.html", containerId = "main")
@Navigation(title = "Provide Model Data", nextItem = LinkAction.class)
class ProvideModelData {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
