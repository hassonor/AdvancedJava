package JavaHTPE11.exam_practice.review.generics.T17;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

import java.util.ArrayList;

public class SubInterval {

    public static <T extends Comparable<T>> Interval<T> setInterval(ArrayList<T> arr) throws IllegalDataException {
        if (arr == null || arr.isEmpty())
            return null;
        T min = arr.get(0);
        T max = arr.get(0);

        for (T item : arr) {
            if (min.compareTo(item) > 0)
                min = item;
            if (max.compareTo(item) < 0)
                max = item;
        }

        return new Interval<T>(min, max);

    }
}
