package JavaHTPE11.exam_practice.exams.b2020_73.Q3;

import JavaHTPE11.exam_practice.generics.testQuestion3.a.NonReduceable;

import java.util.ArrayList;

public class Main {
    public static <T extends Reduceable<T>> ArrayList<T> reduceAll(ArrayList<T> arr) {
        ArrayList<T> ans = new ArrayList<T>();
        for (T item : arr) {
            while (true) {
                try {
                    item.reduce();
                } catch (NonReduceable e) {
                    break;
                }
            }
            ans.add(item);
        }

        return ans;
    }
}
