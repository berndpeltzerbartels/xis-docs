package docs.content;


import docs.Navigation;
import one.xis.ModelData;
import one.xis.Widget;

// @ModelData nur kurz erlären und Verweis
@Widget
@Navigation(title = "Hello World", nextItem = Installation.class)
class HelloWorld {

    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
