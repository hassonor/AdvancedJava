package JavaHTPE11.exam_practice.exams.b2020_99.Q3;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sGroup, T x) {
        ArrayList<T> arr = new ArrayList<T>();

        Iterator<T> it = sGroup.iterator();

        while (it.hasNext()) {
            T temp = it.next();
            if (temp.compareTo(x) < 0)
                arr.add(temp);
        }

        return new SortedGroup<T>(arr);
    }
}
