package docs.content;


import docs.Navigation;
import one.xis.GlobalVariable;
import one.xis.Widget;

// @ModelData nur kurz erlären und Verweis
@Widget
@Navigation(title = "Hello World", nextItem = Installation.class)
class HelloWorld {

    @GlobalVariable("title")
    String title() {
        return "Hello World";
    }

    @GlobalVariable("headline1")
    String headline1() {
        return "Hello World";
    }

    @GlobalVariable("headline2")
    String headline2() {
        return null;
    }
}
