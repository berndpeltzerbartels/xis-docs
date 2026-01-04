package xis.quickstart.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(id = "quickstart-running", url = "/quickstart/running.html", containerId = "main")
@Navigation(title = "Running the App", section = "quickstart", nextItem = WelcomePage.class)
class RunningTheApp {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
