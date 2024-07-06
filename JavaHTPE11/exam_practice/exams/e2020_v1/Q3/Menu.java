package JavaHTPE11.exam_practice.exams.e2020_v1.Q3;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu<T extends Dish> implements Iterable<T> {
    private ArrayList<T> arr;

    public Menu() {
        arr = new ArrayList<T>();
    }

    public void add(T item) {
        arr.add(item);
    }

    public T get(String name) {
        for (T item : arr) {
            if (item.getName().equals(name))
                return item;
        }

        return null;
    }

    public Iterator<T> iterator() {
        return arr.iterator();
    }

}
