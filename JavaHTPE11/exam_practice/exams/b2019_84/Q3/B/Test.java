package JavaHTPE11.exam_practice.exams.b2019_84.Q3.B;

import java.util.ArrayList;

public class Test {
    public static void test(ArrayList<? extends Exception> arr) {
        Exception e1 = null;
        Exception e2 = null;
//        arr.add(e1); // ! Compilation Error
        e1 = arr.iterator().next();

    }
}
