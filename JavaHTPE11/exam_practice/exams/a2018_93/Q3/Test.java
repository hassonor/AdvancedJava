package JavaHTPE11.exam_practice.exams.a2018_93.Q3;

import java.util.ArrayList;

public class Test {
    public static <T extends Comparable<T>> T test(Evaluateble<T> eval, ArrayList<T> arr1, ArrayList<T> arr2) {
        T one = eval.evaluate(arr1);
        T two = eval.evaluate(arr2);
        if (one.compareTo(two) >= 0)
            return one;
        else
            return two;
    }
}
