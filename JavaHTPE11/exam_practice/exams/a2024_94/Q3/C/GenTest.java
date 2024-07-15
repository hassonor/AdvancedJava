package JavaHTPE11.exam_practice.exams.a2024_94.Q3.C;

import java.util.ArrayList;
import java.util.List;

public class GenTest<T> {
    //    public void foo(List<T> list) {
//    }
//    public void foo(List<?> list) {
//    }
    public void foo(List<? extends Shape> list) {
    }

    public static void main(String[] args) {
        GenTest<Shape> test = new GenTest<Shape>();
        List<Shape> myList = new ArrayList<Shape>();
        test.foo(myList);
    }
}
