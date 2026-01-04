package xis.quickstart.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(id = "quickstart-helloworld", url = "/quickstart/helloworld.html", containerId = "main")
@Navigation(title = "Hello World", section = "quickstart", nextItem = RunningTheApp.class)
class HelloWorld {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
