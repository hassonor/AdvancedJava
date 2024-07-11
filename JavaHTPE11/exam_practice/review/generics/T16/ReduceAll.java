package JavaHTPE11.exam_practice.review.generics.T16;

import JavaHTPE11.exam_practice.generics.testQuestion3.a.NonReduceable;

import java.util.ArrayList;

public class ReduceAll {
    public static <T extends Reduceable<T>> ArrayList<T> reduceAll(ArrayList<T> arr) {
        ArrayList<T> arr2 = new ArrayList<T>();

        for (T item : arr) {
            while (true) {
                try {
                    item = item.reduce();
                } catch (NonReduceable e) {
                    break;
                }
            }
            arr2.add(item);
        }
        return arr2;

    }
}

