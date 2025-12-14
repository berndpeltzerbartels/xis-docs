package xis.docs.navi;

import lombok.Data;

import java.util.List;

@Data
public class NaviItemDto {
    private int level;
    private String label;
    private String widgetId;
    private String url;
    private List<NaviItemDto> subItems;
    private List<String> subUrls;
}
