package JavaHTPE11.exam_practice.review.generics.T18;

import java.util.ArrayList;
import java.util.Iterator;

public class Reduce {
    public static <T extends Comparable<T>> SortedGroup<T> reduce(SortedGroup<T> sg, T x) {
        SortedGroup<T> sg2 = new SortedGroup<T>(new ArrayList<T>());

        Iterator<T> it = sg.iterator();

        while (it.hasNext()) {
            T next = it.next();
            if (next.compareTo(x) < 0)
                sg2.add(next);
        }

        return sg2;

    }

}
