package JavaHTPE11.exam_practice.review.generics.T1;

import java.util.ArrayList;

public class Calculate {
    public interface Computable {
        public int compute();
    }

    public static Computable calculate(ArrayList<? extends Computable> arr, Computable c) {
        int val = c.compute();
        for (Computable item : arr) {
            if (item.compute() == val) {
                return item;
            }
        }

        return null;
    }

    public static <T extends Computable> T calculate2(ArrayList<T> arr, T c) {
        int val = c.compute();
        for (T item : arr) {
            if (item.compute() == val) {
                return item;
            }
        }
        return null;
    }

}
