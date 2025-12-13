package xis.docs.content.security;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/sso.html", containerId = "main")
@Navigation(title = "XIS as IDP", nextItem = ExternalIdp.class)
class Sso {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
