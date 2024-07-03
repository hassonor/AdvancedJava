package JavaHTPE11.exam_practice.exams.a2021_74.Q3;

import java.util.ArrayList;

public class MinMax {
    public static <T extends Comparable<T>> AnyPair<T, T> minmax(ArrayList<T> arr) throws Exception {
        if (arr.size() == 1)
            return new AnyPair<T, T>(arr.get(0), arr.get(0));
        else if (arr.isEmpty())
            return new AnyPair<T, T>();
        else {
            T min = null;
            T max = null;

            for (T item : arr) {
                if (min == null || min.compareTo(item) > 0)
                    min = item;
                if (max == null || max.compareTo(item) < 0)
                    max = item;
            }

            return new AnyPair<T, T>(min, max);
        }

    }
}
