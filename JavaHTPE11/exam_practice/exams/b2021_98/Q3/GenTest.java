package JavaHTPE11.exam_practice.exams.b2021_98.Q3;

import java.util.ArrayList;
import java.util.List;

public class GenTest<T> {
    /*
        public void foo(List<T> list){}
        public void foo(List<?> list){}
        public void foo(List list){}
     */
    public void foo(List<T> list) {
    }

    public static void main(String[] args) {
        GenTest<String> test = new GenTest<String>();
        List<String> myList = new ArrayList<String>();
        test.foo(myList);
    }
}
