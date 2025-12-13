package xis.docs.content.security;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/externalidp.html", containerId = "main")
@Navigation(title = "External IDP & SSO")
class ExternalIdp {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
