package JavaHTPE11.exam_practice.generics.testQuestion4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* Will produce
        Evaluateable<Object> a = new Evaluateable<Integer>() {
            @Override
            public Integer evaluate(ArrayList<Integer> x) {
                return x.get(0);
            }
        };

         */

        Evaluateable<? extends Object> a = new Evaluateable<Integer>() {
            @Override
            public Integer evaluate(ArrayList<Integer> x) {
                return x.get(0);
            }
        };

    }

    public static <T extends Comparable<T>> T test(Evaluateable<T> eval, ArrayList<T> first, ArrayList<T> second) {
        T one = eval.evaluate(first);
        T two = eval.evaluate(second);

        if (one.compareTo(two) > 0)
            return one;
        else
            return two;
    }
}
