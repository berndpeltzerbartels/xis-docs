package xis.quickstart.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(id = "quickstart-mainclass", url = "/quickstart/mainclass.html", containerId = "main")
@Navigation(title = "Main Class", section = "quickstart", nextItem = HelloWorld.class)
class MainClass {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
