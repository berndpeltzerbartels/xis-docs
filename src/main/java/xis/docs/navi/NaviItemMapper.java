package xis.docs.navi;


import one.xis.Widget;
import one.xis.context.XISComponent;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

@XISComponent
class NaviItemMapper {

    List<NaviItemDto> toDtos(NaviItem naviItem) {
        var dtos = new ArrayList<NaviItemDto>();
        var item = naviItem;
        while (item != null) {
            dtos.add(toDto(item));
            item = item.getNextItem();
        }
        return dtos;
    }

    private NaviItemDto toDto(NaviItem item) {
        var dto = new NaviItemDto();
        dto.setLabel(item.linkText());
        dto.setWidgetId(targetWidgetId(item));
        dto.setUrl(item.getUrl());
        if (item.getFirstSubItem() != null) {
            dto.setSubItems(toDtos(item.getFirstSubItem()));
            dto.setSubUrls(dto.getSubItems().stream().map(NaviItemDto::getUrl).toList());
        } else {
            dto.setSubItems(emptyList());
        }
        return dto;
    }

    private String targetWidgetId(NaviItem item) {
        if (item.getContentHolderClass().isAnnotationPresent(Widget.class)) {
            return item.getWidgetId();
        }
        if (item.getFirstSubItem() != null) {
            return targetWidgetId(item.getFirstSubItem());
        }
        throw new IllegalStateException("NaviItem " + item + " does not have a target widget");
    }
}
