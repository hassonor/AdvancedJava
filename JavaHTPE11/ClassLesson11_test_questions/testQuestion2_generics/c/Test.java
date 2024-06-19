package JavaHTPE11.ClassLesson11_test_questions.testQuestion2_generics.c;

import JavaHTPE11.ClassLesson11_test_questions.testQuestion2_generics.a.Evaluateble;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {
//        Evaluateble<Object> a = new Evaluateble<Integer>() {
//            @Override
//            public Integer evaluate(ArrayList<Integer> x) {
//                return x.get(0);
//            }
//        }; ! Compilation Error

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(4);


        Evaluateble<Integer> a = new Evaluateble<Integer>() {
            @Override
            public Integer evaluate(ArrayList<Integer> x) {
                return x.get(0);
            }
        };

        Evaluateble<? extends Object> b = new Evaluateble<Integer>() {
            @Override
            public Integer evaluate(ArrayList<Integer> x) {
                return x.get(0);
            }
        };

        System.out.println(a.evaluate(array));


    }
}
