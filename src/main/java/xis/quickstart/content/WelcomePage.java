package xis.quickstart.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

@Widget(id = "quickstart-welcomepage", url = "/quickstart/welcomepage.html", containerId = "main")
@Navigation(title = "Welcome Page", section = "quickstart", nextItem = PageLinks.class)
class WelcomePage {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
