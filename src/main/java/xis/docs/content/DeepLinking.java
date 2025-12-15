package xis.docs.content;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.docs.content.forms.Forms;
import xis.docs.navi.Navigation;

@Widget(url = "/docs/deeplinking.html", containerId = "main")
@Navigation(title = "Deep Linking", nextItem = Forms.class)
public class DeepLinking {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
