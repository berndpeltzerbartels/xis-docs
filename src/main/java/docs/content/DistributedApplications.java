package docs.content;

import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

@Widget
@Navigation(title = "Distributed Applications", nextItem = MicroFrontendArchitecture.class)
public class DistributedApplications {

    @GlobalVariable("title")
    String title() {
        return "Distributed Applications";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Distributed Applications";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
