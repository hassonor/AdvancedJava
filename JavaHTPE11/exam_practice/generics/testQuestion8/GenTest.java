package JavaHTPE11.exam_practice.generics.testQuestion8;

import java.util.ArrayList;
import java.util.List;

public class GenTest<T> {
    public static void main(String[] args) {
        GenTest<String> test = new GenTest<String>();
        List<String> myList = new ArrayList<String>();
        test.foo(myList);
    }

    public void foo(List<?> list) {
    }
}
