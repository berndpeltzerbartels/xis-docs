package docs.navi;

import lombok.Getter;
import one.xis.context.XISComponent;
import one.xis.context.XISInit;
import one.xis.context.XISInject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@XISComponent
class NaviServiceImpl implements NaviService {

    @Getter
    private List<NaviItemDto> naviItems;

    @XISInject(annotatedWith = Navigation.class)
    private List<Object> contentWidgets;

    @XISInject
    private NaviValidator naviValidator;

    @XISInject
    private NaviItemMapper naviItemMapper;


    @XISInit
    void buildNavi() {
        Navi navi = new Navi(getFirstNaviItem());
        naviValidator.validate(navi, new ArrayList<>(contentWidgets));
        this.naviItems = naviItemMapper.toDtos(navi.getRoot());
    }


    private NaviItem getFirstNaviItem() {
        return createNaviItem(getFirstNaviClass(), 1, null);
    }

    /**
     * Searching for the only widget that is not referenced by any other widget as nextItem
     * or fitstSubItem. An exception is thrown if there is not exactly one such widget.
     *
     * @return the first navi item class
     */
    private Class<?> getFirstNaviClass() {
        var itemClasses = new HashSet<Class<?>>(contentWidgets.stream().map(Object::getClass).toList());
        var toRemove = new HashSet<Class<?>>();
        for (Class<?> clazz : itemClasses) {
            if (!clazz.isAnnotationPresent(Navigation.class)) {
                throw new IllegalStateException("Class " + clazz + " is not annotated with @Navigation");
            }
            Navigation nav = clazz.getAnnotation(Navigation.class);
            toRemove.add(nav.firstSubItem());
            toRemove.add(nav.nextItem());
        }
        itemClasses.removeAll(toRemove);
        return switch (itemClasses.size()) {
            case 0 ->
                    throw new IllegalStateException("No first navi item found. There must be one class that is not referenced as nextItem or firstSubItem by any other class.");
            case 1 -> itemClasses.iterator().next();
            default ->
                    throw new IllegalStateException("Multiple first navi items found: " + itemClasses + ". There must be exactly one class that is not referenced as nextItem or firstSubItem by any other class.");
        };
    }

    private NaviItem createNaviItem(Class<?> clazz, int number, NaviItem parent) {
        Navigation nav = clazz.getAnnotation(Navigation.class);
        if (nav == null) {
            throw new IllegalStateException("Class " + clazz + " is not annotated with @Navigation");
        }
        NaviItem item = new NaviItem();
        item.setContentHolderClass(clazz);
        item.setTitle(nav.title());
        item.setWidgetId(clazz.getSimpleName());
        item.setNumber(number);
        item.setParentItem(parent);
        if (nav.firstSubItem() != Void.class) {
            item.setFirstSubItem(createNaviItem(nav.firstSubItem(), 1, item));
        }
        if (nav.nextItem() != Void.class) {
            item.setNextItem(createNaviItem(nav.nextItem(), number + 1, parent));
        }
        return item;
    }

    @Override
    public Class<?> findWidgetClassByKey(String key) {
        if (key == null || key.isEmpty()) {
            return null;
        }

        String lowerKey = key.toLowerCase();

        // Search through all content widgets (case-insensitive)
        for (Object widget : contentWidgets) {
            Class<?> clazz = widget.getClass();
            String className = clazz.getSimpleName();
            String packageName = clazz.getPackageName();

            // Check if class matches the key pattern
            if (matchesKey(lowerKey, className, packageName)) {
                return clazz;
            }
        }

        return null;
    }

    private boolean matchesKey(String lowerKey, String className, String packageName) {
        // Simple case: xyz -> docs.content.Xyz
        if (!lowerKey.contains("-")) {
            return packageName.equals("docs.content") &&
                    className.toLowerCase().equals(lowerKey);
        }

        // Dash case: a-b -> docs.content.a.B
        String[] parts = lowerKey.split("-", 2);
        if (parts.length == 2) {
            String expectedPackage = "docs.content." + parts[0].toLowerCase();
            String expectedClassName = parts[1].toLowerCase();

            return packageName.equals(expectedPackage) &&
                    className.toLowerCase().equals(expectedClassName);
        }

        return false;
    }

}
