package xis.docs;


import lombok.RequiredArgsConstructor;
import one.xis.ModelData;
import one.xis.Page;
import xis.navi.NaviItemDto;
import xis.navi.NaviService;

import java.util.List;


@Page("/docs/{key}.html")
@RequiredArgsConstructor
class DocumentationPage {
    private final NaviService naviService;


    @ModelData
    List<NaviItemDto> docsNaviItems() {
        return naviService.getNaviItems("docs");
    }

/*
    @ModelData
    List<NaviItemDto> advancedNaviItems() {
        return naviService.getNaviItems("advanced");
    }


    @ModelData
    List<NaviItemDto> referenceNaviItems() {
        return naviService.getNaviItems("reference");
    }

 */

    @ModelData
    String frameworkName() {
        return "Xis1";
    }

    @ModelData
    String xisVersion() {
        return "0.3.0";
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
