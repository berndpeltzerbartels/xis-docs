package xis.docs;


import lombok.RequiredArgsConstructor;
import one.xis.ModelData;
import one.xis.Page;
import xis.docs.navi.NaviItemDto;
import xis.docs.navi.NaviService;

import java.util.List;


@Page("/docs/{key}.html")
@RequiredArgsConstructor
class DocumentationPage {
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
        return "0.2.0";
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
