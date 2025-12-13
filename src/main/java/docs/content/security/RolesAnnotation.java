package docs.content.security;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/rolesannotation.html", containerId = "main")
@Navigation(title = "Roles Annotation", nextItem = LocalAuthentication.class)
class RolesAnnotation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
