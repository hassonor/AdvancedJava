package JavaHTPE11.exam_practice.review.generics.T12;

import java.util.ArrayList;

public class Main {
    public static <T extends Evaluateable> T smallest(ArrayList<T> arr) {
        if (arr == null || arr.isEmpty())
            return null;
        T item = arr.get(0);

        for (T element : arr) {
            if (item.evaluate() > element.evaluate())
                item = element;
        }

        return item;
    }

    public static double calculate(ArrayList<? extends Evaluateable> arr) {
        if (arr == null || arr.isEmpty())
            return 0;
        int sum = 0;
        for (Evaluateable item : arr) {
            sum += item.evaluate();
        }

        return sum / (double) arr.size();
    }
}
