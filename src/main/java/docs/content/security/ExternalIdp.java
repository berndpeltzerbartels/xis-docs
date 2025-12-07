package docs.content.security;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/externalidp.html", containerId = "main")
@Navigation(title = "External IDP & SSO")
class ExternalIdp {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
