package JavaHTPE11.exam_practice.exams.b2020_99.Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortedGroup<T extends Comparable<T>> implements Iterable<T> {
    private ArrayList<T> arr;

    public SortedGroup(ArrayList<T> arr) {
        arr = new ArrayList<T>();
        Collections.sort(arr);
    }

    public void add(T item) {
        int i = 0;
        while (i < arr.size() &&
                arr.get(i).compareTo(item) < 0) {
            i++;
        }
        arr.add(i, item);
    }

    public int remove(T item) {
        int count = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i).equals(item)) {
                arr.remove(i);
                count++;
            }
        }
        return count;
    }

    public Iterator<T> iterator() {
        return arr.iterator();
    }
}
