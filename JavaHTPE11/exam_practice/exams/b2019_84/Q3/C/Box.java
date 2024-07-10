package JavaHTPE11.exam_practice.exams.b2019_84.Q3.C;

import java.util.HashSet;
import java.util.Set;

public class Box<V> {
    public void foo1(Set<V> s1, Set<? extends V> s2) {
    }

    public void foo2(Set<?> s1, Set<?> s2) {
    }

    public <E> void foo3(Set<E> s1, Set<E> s2) {
    }

    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        Set<String> strSet = new HashSet<String>();
        Set<Integer> intSet = new HashSet<Integer>();
        box.foo1(strSet, strSet);
        box.foo2(strSet, intSet);
//        box.foo3(intSet,strSet); / ! Compilation Error
    }
}
