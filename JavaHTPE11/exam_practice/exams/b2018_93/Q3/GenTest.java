package JavaHTPE11.exam_practice.exams.b2018_93.Q3;

import java.util.*;

public class GenTest {

    public static <T> void func(Set<T> list) {
    }
//    public static <T> void func(SortedSet<T> list) {
//    }
//
//    public static void func(Collection<Object> list) {
//    }
//    public static void func(Set<?> list) {
//    }
//
//    public static void func(Collection<?> list) {
//    }

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        SortedSet<Integer> s2 = new TreeSet<Integer>();
        func(s1);
        func(s2);
    }
}
