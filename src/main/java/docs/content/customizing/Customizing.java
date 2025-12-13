package docs.content.customizing;

import docs.navi.Navigation;
import docs.content.DistributedApplications;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.context.XISComponent;

@XISComponent
@Navigation(title = "Customizing", firstSubItem = SelectableHighlighting.class, nextItem = DistributedApplications.class)
public class Customizing {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
