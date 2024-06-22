package JavaHTPE11.exam_practice.generics.testQuestion5;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu<T extends Dish> {
    private ArrayList<T> list = new ArrayList<T>();

    public void add(T item) {
        list.add(item);
    }

    public T get(String name) {
        for (T item : list) {
            if (item.getName().equals(name))
                return item;
        }

        return null;
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }
}
