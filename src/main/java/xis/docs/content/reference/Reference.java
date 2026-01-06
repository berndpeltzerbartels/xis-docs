package xis.docs.content.reference;

import one.xis.ModelData;
import one.xis.Title;
import one.xis.context.Component;
import xis.navi.Navigation;

@Component
@Navigation(title = "Reference", firstSubItem = ClassAnnotationReference.class)
public class Reference {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
