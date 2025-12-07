package docs.content.templatesyntax;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/expressionlanguage.html", containerId = "main")
@Navigation(title = "Expression Language", nextItem = FrameworkTags.class)
class ExpressionLanguage {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
