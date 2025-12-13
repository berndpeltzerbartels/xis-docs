package xis.docs.content.customizing;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.context.XISComponent;
import xis.docs.content.DistributedApplications;
import xis.docs.navi.Navigation;

@XISComponent
@Navigation(title = "Customizing", firstSubItem = SelectableHighlighting.class, nextItem = DistributedApplications.class)
public class Customizing {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
