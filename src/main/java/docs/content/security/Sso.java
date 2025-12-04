package docs.content.security;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget
@Navigation(title = "XIS as IDP", nextItem = ExternalIdp.class)
class Sso {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }

}
