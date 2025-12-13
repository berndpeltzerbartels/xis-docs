package xis.docs.content.security;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/localauthentication.html", containerId = "main")
@Navigation(title = "XIS Authentication", nextItem = Sso.class)
class LocalAuthentication {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}

