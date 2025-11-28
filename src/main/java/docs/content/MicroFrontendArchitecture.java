package docs.content;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Micro-Frontend Architecture", nextItem = Reference.class)
public class MicroFrontendArchitecture {

    @GlobalVariable("title")
    String title() {
        return "Micro-Frontend Architecture";
    }
}
