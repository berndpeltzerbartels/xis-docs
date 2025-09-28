package docs.content;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Micro-Frontend Architecture", nextItem = MethodAnnotations.class)
class MicroFrontendArchitecture {

    @GlobalVariable("title")
    String title() {
        return "Micro-Frontend Architecture";
    }
}
