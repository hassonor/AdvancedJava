package JavaHTPE11.exam_practice.review.generics.T27;

import java.util.ArrayList;

public class Test {
    public static void test(ArrayList<? extends Exception> arr) {
        Exception e1 = null;
        Exception e2 = null;
//        arr.add(e1); // ! Compilation Error
        e1 = arr.iterator().next();

    }
}
