package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Framework Tags", nextItem = FrameworkAttributes.class)
class FrameworkTags {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
