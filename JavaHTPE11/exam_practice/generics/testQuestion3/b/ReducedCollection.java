package JavaHTPE11.exam_practice.generics.testQuestion3.b;

import JavaHTPE11.exam_practice.generics.testQuestion3.a.NonReduceable;
import JavaHTPE11.exam_practice.generics.testQuestion3.a.Reduceable;

import java.util.ArrayList;

public class ReducedCollection<T extends Reduceable> {
    private ArrayList<T> arr;

    public ReducedCollection() {
        arr = new ArrayList<T>();
    }

    public void add(T item) {
        reduce(item);
        arr.add(item);
    }

    public boolean exist(T item) {
        reduce(item);
        for (T obj : arr) {
            if (item.equals(obj))
                return true;
        }
        return false;
    }

    private void reduce(T item) {
        while (true) {
            try {
                item.reduce();

            } catch (NonReduceable e) {
                break;
            }
        }
    }
}
