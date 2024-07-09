package JavaHTPE11.exam_practice.review.generics.T10;

import java.util.ArrayList;

public class MinMax {

    public static <T extends Comparable<T>> AnyPair<T, T> minmax(ArrayList<T> arr) throws Exception {
        if (arr.size() == 1)
            return new AnyPair<T, T>(arr.get(0), arr.get(0));

        if (arr.isEmpty() || arr == null)
            return new AnyPair<T, T>();

        T min = arr.get(0);
        T max = arr.get(0);

        for (T item : arr) {
            if (min.compareTo(item) > 0)
                min = item;
            if (max.compareTo(item) < 0)
                max = item;
        }

        return new AnyPair<T, T>(min, max);

    }


}
