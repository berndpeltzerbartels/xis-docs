package docs.content.security;

import docs.Navigation;
import docs.content.DistributedApplications;
import one.xis.ModelData;
import one.xis.context.XISComponent;

@XISComponent
@Navigation(title = "Security", firstSubItem = RolesAnnotation.class, nextItem = DistributedApplications.class)
public class Security {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
