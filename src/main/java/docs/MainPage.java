package docs;


import docs.navi.NaviItemDto;
import docs.navi.NaviService;
import lombok.RequiredArgsConstructor;
import one.xis.ModelData;
import one.xis.Page;

import java.util.List;


@Page("/{key}.html")
@RequiredArgsConstructor
class MainPage {
    private final NaviService naviService;


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
