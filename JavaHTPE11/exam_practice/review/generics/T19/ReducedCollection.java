package JavaHTPE11.exam_practice.review.generics.T19;

import JavaHTPE11.exam_practice.generics.testQuestion3.a.NonReduceable;

import java.util.ArrayList;

public class ReducedCollection<T extends Reduceable> {
    private ArrayList<T> arr;

    public ReducedCollection() {
        arr = new ArrayList<T>();
    }

    public void add(T item) {
        reduceItem(item);
        arr.add(item);
    }

    public boolean exists(T item) {
        reduceItem(item);
        return arr.contains(item);
    }

    private void reduceItem(T item) {
        while (true) {
            try {
                item.reduce();
            } catch (NonReduceable e) {
                break;
            }
        }
    }

}
