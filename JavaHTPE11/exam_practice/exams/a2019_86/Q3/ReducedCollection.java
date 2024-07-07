package JavaHTPE11.exam_practice.exams.a2019_86.Q3;


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

    public boolean exist(T item) {
        reduceItem(item);

        for (T temp : arr) {
            if (temp.equals(item))
                return true;
        }

        return false;
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
