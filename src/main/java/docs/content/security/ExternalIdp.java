package docs.content.security;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "External IDP & SSO")
class ExternalIdp {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
