package docs.content.security;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/localauthentication.html", containerId = "main")
@Navigation(title = "XIS Authentication", nextItem = Sso.class)
class LocalAuthentication {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}

