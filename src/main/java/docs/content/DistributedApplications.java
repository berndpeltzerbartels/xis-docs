package docs.content;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Distributed Applications", nextItem = MicroFrontendArchitecture.class)
public class DistributedApplications {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
