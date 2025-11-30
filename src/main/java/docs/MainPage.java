package docs;


import docs.navi.NaviItemDto;
import docs.navi.NaviService;
import lombok.RequiredArgsConstructor;
import one.xis.*;
import one.xis.utils.lang.ClassUtils;
import one.xis.utils.lang.StringUtils;

import java.util.List;


@Page("/{key}.html")
@RequiredArgsConstructor
class MainPage {
    private final NaviService naviService;

    @MethodParameter("widgetClass")
    Class<?> widgetClass(@PathVariable("key") String key) {
        if (StringUtils.isEmpty(key) || "index".equals(key)) {
            return null;
        }
        try {
            return ClassUtils.classForName("docs.content." + key.replace("-", "+"));
        } catch (Exception e) {
            return null;
        }
    }

    @ModelData
    String defaultWidget(@MethodParameter("widgetClass") Class<?> widgetClass) {
        if (widgetClass == null) {
            return null;
        }
        return widgetClass.getAnnotation(Widget.class).value().isEmpty() ? widgetClass.getSimpleName() : widgetClass.getAnnotation(Widget.class).value();
    }

    @Title
    String pageTitle(@MethodParameter("widgetClass") Class<?> widgetClass) {
        if (widgetClass == null) {
            return "Xis1 Documentation";
        }
        if (widgetClass.isAnnotationPresent(Navigation.class)) {
            return widgetClass.getAnnotation(Navigation.class).title();
        }
        return "Xis1 Documentation";
    }

    @ModelData
    List<NaviItemDto> naviItems() {
        return naviService.getNaviItems();
    }

    @ModelData
    String frameworkName() {
        return "Xis1";
    }

    @ModelData
    String xisVersion() {
        return "0.1.20-SNAPSHOT";
    }

    @ModelData
    String lombokVersion() {
        return "1.18.26";
    }

    @ModelData
    String springBootVersion() {
        return "3.1.4";
    }

    @ModelData
    String junitVersion() {
        return "5.10.0";
    }

}
