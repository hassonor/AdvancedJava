package JavaHTPE11.exam_practice.exams.a2021_91.Q3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    }

    public static <T extends Evaluateable> T smallest(ArrayList<T> arr) {
        if (arr == null || arr.isEmpty())
            return null;

        T item = arr.get(0);
        int min = arr.get(0).evaluate();

        for (T temp : arr) {
            int evalValue = temp.evaluate();
            if (evalValue < min) {
                item = temp;
                min = evalValue;
            }

        }
        return item;
    }

    public static int calculate(ArrayList<? extends Evaluateable> arr) {
        if (arr == null || arr.isEmpty())
            return 0;

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).evaluate();
        }

        return sum / arr.size();

    }
}

