package xis.docs.content;


import one.xis.ModelData;
import one.xis.Title;
import one.xis.Widget;
import xis.navi.Navigation;

// @ModelData nur kurz erlären und Verweis
@Widget(url = "/docs/helloworld.html", containerId = "main")
@Navigation(title = "Hello World!", nextItem = Installation.class)
class HelloWorld {

    @Title
    @ModelData
    String chapterHeadline() {
        return getClass().getAnnotation(Navigation.class).title();
    }
}
