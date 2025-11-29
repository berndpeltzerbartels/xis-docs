package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Framework Attributes", nextItem = CustomElFunctions.class)
class FrameworkAttributes {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
