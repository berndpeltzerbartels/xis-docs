package docs.navi;

import lombok.Data;

import java.util.List;

@Data
public class NaviItemDto {
    private int level;
    private String label;
    private String widgetId;
    private List<NaviItemDto> subItems;
}
