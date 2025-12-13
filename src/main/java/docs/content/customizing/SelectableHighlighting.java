package docs.content.customizing;

import docs.navi.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget(url = "/selectablehighlighting.html", containerId = "main")
@Navigation(title = "Selectable & Highlighting", nextItem = SystemErrors.class)
public class SelectableHighlighting {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
