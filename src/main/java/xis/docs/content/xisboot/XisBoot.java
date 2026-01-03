package xis.docs.content.xisboot;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.context.Component;
import xis.docs.content.pagesandwidgets.PagesAndWidgets;
import xis.docs.navi.Navigation;

@Component
@Navigation(title = "XIS Boot", nextItem = PagesAndWidgets.class, firstSubItem = XisBootInstallation.class)
public class XisBoot {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
