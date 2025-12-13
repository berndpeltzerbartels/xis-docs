package docs.content.security;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/sso.html", containerId = "main")
@Navigation(title = "XIS as IDP", nextItem = ExternalIdp.class)
class Sso {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
