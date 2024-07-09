package JavaHTPE11.exam_practice.review.generics.T11;

import java.util.ArrayList;
import java.util.Iterator;

public class Group<T> implements Iterable<T> {
    private ArrayList<T> arr;

    public Group() {
        arr = new ArrayList<T>();
    }

    public boolean add(T item) {
        for (T element : arr) {
            if (item.equals(element)) {
                return false;
            }
        }

        arr.add(item);
        return true;
    }

    public boolean remove(T item) {
        for (T element : arr) {
            if (item.equals(element)) {
                arr.remove(element);
                return true;
            }
        }

        return false;
    }

    public Iterator<T> iterator() {
        return arr.iterator();
    }


}
