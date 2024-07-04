package JavaHTPE11.exam_practice.exams.a2021_78.Q3;

import java.util.Iterator;

public class Main {
    public static <T extends Comparable<T>> Group<T> boundedGroup(Group<T> gr, T upperBound) {
        Group<T> g2 = new Group<T>();

        Iterator<T> it = gr.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (next.compareTo(upperBound) < 0)
                g2.add(next);
        }

        return g2;
    }

}
