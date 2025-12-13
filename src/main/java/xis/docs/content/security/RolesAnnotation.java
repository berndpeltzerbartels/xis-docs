package xis.docs.content.security;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/rolesannotation.html", containerId = "main")
@Navigation(title = "Roles Annotation", nextItem = LocalAuthentication.class)
class RolesAnnotation {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
