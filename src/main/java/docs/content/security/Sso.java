package docs.content.security;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Single Sign-On (SSO)")
class Sso {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
