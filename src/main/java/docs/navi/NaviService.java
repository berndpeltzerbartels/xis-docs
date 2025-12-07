package docs.navi;

import java.util.List;

public interface NaviService {
    List<NaviItemDto> getNaviItems();
    
    /**
     * Finds a widget class by key (case-insensitive).
     * Convention:
     * - Simple names (e.g. "xyz") → Class in docs.content (e.g. docs.content.Xyz)
     * - Names with dash (e.g. "a-b") → Package is docs.content.a, Class is docs.content.a.B
     * 
     * @param key The widget key from URL path
     * @return The widget class or null if not found
     */
    Class<?> findWidgetClassByKey(String key);
}
