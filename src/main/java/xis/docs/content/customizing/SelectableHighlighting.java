package xis.docs.content.customizing;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.navi.Navigation;

@Widget(url = "/selectablehighlighting.html", containerId = "main")
@Navigation(title = "Selectable & Highlighting", nextItem = SystemErrors.class)
public class SelectableHighlighting {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
