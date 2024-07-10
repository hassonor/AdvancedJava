package JavaHTPE11.exam_practice.review.generics.T15;


import JavaHTPE11.exam_practice.exams.a2020_82.Q3.NonReverseable;

import java.util.ArrayList;

public class Main {

    public static <T extends Reverseable<T>> ArrayList<T> reverseAll(ArrayList<T> arr) {
        ArrayList<T> arr2 = new ArrayList<T>();

        for (T item : arr) {
            try {
                arr2.add(item.reverse());
            } catch (NonReverseable e) {
                arr2.add(item);
            }
        }

        return arr2;
    }

}

