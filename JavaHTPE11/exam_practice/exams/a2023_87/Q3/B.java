package JavaHTPE11.exam_practice.exams.a2023_87.Q3;

import java.util.ArrayList;

public class B {
    public interface Computable {
        public int compute();
    }

    public static Computable calculate(ArrayList<? extends Computable> arr, Computable obj) {
        int value = obj.compute();
        for (Computable item : arr) {
            if (item.compute() == value)
                return item;
        }

        return null;

    }

    public static <T extends Computable> T calculate2(ArrayList<T> arr, T obj) {
        int value = obj.compute();
        for (T item : arr) {
            if (item.compute() == value)
                return item;
        }

        return null;
    }

    ;
}
