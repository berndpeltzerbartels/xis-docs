package docs.navi;


import docs.Navigation;
import one.xis.context.XISComponent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@XISComponent
class NaviValidator {

    void validate(Navi navi, Collection<Object> contentWidgets) {
        validateNoUnlinkedItems(navi, contentWidgets);
        validateNoDuplicateLinking(navi);
    }


    private void validateNoUnlinkedItems(Navi navi, Collection<Object> contentWidgets) {
        var itemClasses = new HashSet<Class<?>>(contentWidgets.stream().map(Object::getClass).toList());
        var linkedClasses = new HashSet<Class<?>>();
        findLinkedClasses(navi.getRoot(), linkedClasses);
        itemClasses.removeAll(linkedClasses);
        itemClasses.remove(navi.getRoot().getContentHolderClass());
        if (!itemClasses.isEmpty()) {
            throw new IllegalStateException("There are unlinked items: " + itemClasses);
        }
    }

    private void findLinkedClasses(NaviItem naviItem, Collection<Class<?>> linkedClasses) {
        if (naviItem.getNextItem() != null && naviItem.getNextItem().getContentHolderClass() != Void.class) {
            linkedClasses.add(naviItem.getNextItem().getContentHolderClass());
            findLinkedClasses(naviItem.getNextItem(), linkedClasses);
        }
        if (naviItem.getFirstSubItem() != null && naviItem.getFirstSubItem().getContentHolderClass() != Void.class) {
            linkedClasses.add(naviItem.getFirstSubItem().getContentHolderClass());
            findLinkedClasses(naviItem.getFirstSubItem(), linkedClasses);
        }
    }


    private void validateNoDuplicateLinking(Navi navi) {
        validateNoDuplicateLinking(navi.getRoot(), new ArrayList<>());
    }

    private void validateNoDuplicateLinking(NaviItem naviItem, Collection<Class<?>> linkedClasses) {
        if (naviItem.getNextItem() != null && naviItem.getNextItem().getContentHolderClass() != Void.class) {
            if (linkedClasses.contains(naviItem.getNextItem().getContentHolderClass())) {
                throw new IllegalStateException("Duplicate linking of class " + naviItem.getNextItem().getContentHolderClass());
            }
            linkedClasses.add(naviItem.getNextItem().getContentHolderClass());
            validateNoDuplicateLinking(naviItem.getNextItem(), linkedClasses);
        }
        if (naviItem.getFirstSubItem() != null && naviItem.getFirstSubItem().getContentHolderClass() != Void.class) {
            if (linkedClasses.contains(naviItem.getFirstSubItem().getContentHolderClass())) {
                throw new IllegalStateException("Duplicate linking of class " + naviItem.getFirstSubItem().getContentHolderClass());
            }
            linkedClasses.add(naviItem.getFirstSubItem().getContentHolderClass());
            validateNoDuplicateLinking(naviItem.getFirstSubItem(), linkedClasses);
        }
    }

    private NaviItem createNaviItem(Class<?> clazz) {
        Navigation nav = clazz.getAnnotation(Navigation.class);
        if (nav == null) {
            throw new IllegalStateException("Class " + clazz + " is not annotated with @Navigation");
        }
        NaviItem item = new NaviItem();
        item.setContentHolderClass(clazz);
        if (nav.firstSubItem() != Void.class) {
            item.setFirstSubItem(createNaviItem(nav.firstSubItem()));
        }
        if (nav.nextItem() != Void.class) {
            item.setNextItem(createNaviItem(nav.nextItem()));
        }
        return item;
    }

}
