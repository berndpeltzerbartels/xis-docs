package xis.docs.content.templatesyntax;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/expressionlanguage.html", containerId = "main")
@Navigation(title = "Expression Language", nextItem = FrameworkTags.class)
class ExpressionLanguage {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
