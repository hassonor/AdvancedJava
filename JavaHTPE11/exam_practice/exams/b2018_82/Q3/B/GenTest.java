package JavaHTPE11.exam_practice.exams.b2018_82.Q3.B;

import java.util.*;

public class GenTest {
//    public static <T> void func(Collection<T> list) {
//    }

//    public static void func(Collection<Object> list) {
//    }

//    public static void func(Collection<?> list) {
//    }

    public static void func(Collection<?> list) {
    }

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        Set<Integer> l2 = new HashSet<Integer>();
        func(l1);
        func(l2);
    }
}
