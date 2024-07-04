package JavaHTPE11.exam_practice.exams.a2021_78.Q3;

import java.util.ArrayList;
import java.util.Iterator;

public class Group<T> implements Iterable<T> {
    private ArrayList<T> arr;

    public Group() {
        arr = new ArrayList<T>();
    }

    public boolean add(T item) {
        for (T temp : arr) {
            if (temp.equals(item))
                return false;
        }

        arr.add(item);
        return true;
    }

    public boolean remove(T item) {
        for (T temp : arr) {
            if (temp.equals(item)) {
                arr.remove(temp);
                return true;
            }
        }

        return false;
    }

    public Iterator<T> iterator() {
        return arr.iterator();
    }
}
