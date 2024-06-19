package JavaHTPE11.ClassLesson11_test_questions.testQuestion2_generics.b;

import JavaHTPE11.ClassLesson11_test_questions.testQuestion2_generics.a.Evaluateble;

import java.util.ArrayList;

public class Ans {
    public static void main(String[] args) {
   
    }

    public static <T extends Comparable<T>> T test(Evaluateble<T> eva, ArrayList<T> first, ArrayList<T> second) {
        T evaFirst = eva.evaluate(first);
        T evaSecond = eva.evaluate(second);
        if (evaFirst.compareTo(evaSecond) > 0) return evaFirst;

        return evaSecond;
    }

}
