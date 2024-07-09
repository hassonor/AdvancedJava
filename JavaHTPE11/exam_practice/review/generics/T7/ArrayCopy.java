package JavaHTPE11.exam_practice.review.generics.T7;

import java.util.ArrayList;

public class ArrayCopy {
    public static <T extends Copyable<T>> ArrayList<T> arrayCopy(ArrayList<T> one, ArrayList<T> two) throws CopyException {
        two = new ArrayList<T>();

        for (T item : one) {
            two.add(item.copy());
        }

        return two;
    }

}
