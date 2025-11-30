package docs.content;

import docs.Navigation;
import docs.content.security.Security;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

@Widget
@Navigation(title = "XIS-Theme", nextItem = Security.class)
public class XisTheme {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
