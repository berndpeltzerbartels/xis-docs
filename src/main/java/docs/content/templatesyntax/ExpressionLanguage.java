package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget
@Navigation(title = "Expression Language", nextItem = FrameworkTags.class)
class ExpressionLanguage {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
