package docs.content.security;

import docs.navi.Navigation;
import docs.content.customizing.Customizing;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.context.XISComponent;

@XISComponent
@Navigation(title = "Security", firstSubItem = RolesAnnotation.class, nextItem = Customizing.class)
public class Security {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
