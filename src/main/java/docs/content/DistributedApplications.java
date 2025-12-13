package docs.content;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/distributedapplications.html", containerId = "main")
@Navigation(title = "Distributed Applications", nextItem = MicroFrontendArchitecture.class)
public class DistributedApplications {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
