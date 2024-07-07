package JavaHTPE11.exam_practice.exams.b2020_76.Q3;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

import java.util.ArrayList;

public class Main {
    public static <T extends Comparable<T>> Interval<T> setInterval(ArrayList<T> arr) throws IllegalDataException {
        if (arr == null || arr.isEmpty())
            return null;

        T min = arr.get(0);
        T max = arr.get(0);

        for (T item : arr) {
            if (item.compareTo(min) < 0)
                min = item;
            if (item.compareTo(max) > 0)
                max = item;
        }
        return new Interval<T>(min, max);
    }

}
