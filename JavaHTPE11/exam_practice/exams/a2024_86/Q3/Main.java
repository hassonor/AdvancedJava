package JavaHTPE11.exam_practice.exams.a2024_86.Q3;

import java.util.Iterator;

public class Main {
    public static <T extends Comparable<T>> SortedGroup<T> cut(SortedGroup<T> sg, T item) {
        SortedGroup<T> sg2 = new SortedGroup<T>();
        Iterator<T> it = sg.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (next.compareTo(item) > 0)
                sg2.add(next);
        }

        return sg2;

    }

}
