package xis;

import lombok.RequiredArgsConstructor;
import one.xis.ModelData;
import one.xis.Page;
import one.xis.WelcomePage;
import xis.navi.NaviItemDto;
import xis.navi.NaviService;

import java.util.List;


@Page("/index.html")
@WelcomePage
@RequiredArgsConstructor
class MainPage {
    private final NaviService naviService;


    @ModelData
    List<NaviItemDto> naviItems() {
        return naviService.getNaviItems("docs");
    }


}
