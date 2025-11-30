package docs.content.security;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "XIS als IDP", nextItem = ExternalIdp.class)
class Sso {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
