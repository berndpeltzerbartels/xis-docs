package docs.content.controllermethods;

import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

@Widget
@Navigation(title = "Link Action", nextItem = ActionsForNavigation.class)
class LinkAction {
    
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
