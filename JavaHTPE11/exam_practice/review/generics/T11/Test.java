package JavaHTPE11.exam_practice.review.generics.T11;


import java.util.Iterator;

public class Test {
    public static <T extends Comparable<T>> Group<T> boundedGroup(Group<T> gr, T upperBound) {
        Group<T> gr2 = new Group<T>();
        Iterator<T> it = gr.iterator();

        while (it.hasNext()) {
            T next = it.next();
            if (next.compareTo(upperBound) < 0)
                gr2.add(next);
        }

        return gr2;
    }
}
