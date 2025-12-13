package xis.docs.content.security;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.context.XISComponent;
import xis.docs.content.customizing.Customizing;
import xis.docs.navi.Navigation;

@XISComponent
@Navigation(title = "Security", firstSubItem = RolesAnnotation.class, nextItem = Customizing.class)
public class Security {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
