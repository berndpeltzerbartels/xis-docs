package xis.quickstart.content;


import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(id = "quickstart-testing", url = "/quickstart/testing.html", containerId = "main")
@Navigation(title = "Testing", section = "quickstart", nextItem = RunningTheApp.class)
class Testing {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
