package docs.navi;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

@Data
public class NaviItem {
    private NaviItem firstSubItem;
    private NaviItem nextItem;
    private NaviItem parentItem;
    private Class<?> contentHolderClass;
    private int number;
    private String title;
    private String widgetId;


    public String linkText() {
        var numbers = new ArrayList<>();
        var item = this;
        while (item != null) {
            numbers.add(item.getNumber());
            item = item.getParentItem();
        }
        Collections.reverse(numbers);
        var str = numbers.stream().map(String::valueOf).collect(Collectors.joining("."));
        str += ". " + title;
        return str;
    }

    @Override
    public String toString() {
        return linkText();
    }
}
