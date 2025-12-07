package docs.content;


import docs.Navigation;
import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;

// @ModelData nur kurz erlären und Verweis
@Widget(url = "/helloworld.html", containerId = "main")
@Navigation(title = "Hello World!", nextItem = Installation.class)
class HelloWorld {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
