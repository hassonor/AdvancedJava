package JavaHTPE11.exam_practice.review.generics.T22;

import JavaHTPE11.exam_practice.exams.b2019_83.Q3.OutOfBoundsException;

import java.util.ArrayList;

public class Interval<T extends Comparable<T>> {
    private T up;
    private T down;
    private ArrayList<T> arr;

    public Interval(T up, T down) throws OutOfBoundsException {
        if (up.compareTo(down) < 0)
            throw new OutOfBoundsException();
        this.up = up;
        this.down = down;
        arr = new ArrayList<T>();
    }

    public void add(T item) throws OutOfBoundsException {
        if (item.compareTo(down) < 0 || item.compareTo(up) > 0)
            throw new OutOfBoundsException();
        if (!arr.contains(item))
            arr.add(item);
    }

    public Interval<T> subInterval(T nUp, T nDown) throws OutOfBoundsException {
        if (nUp.compareTo(nDown) < 0 || nUp.compareTo(up) > 0 || nDown.compareTo(down) < 0)
            throw new OutOfBoundsException();

        Interval<T> nInterval = new Interval<T>(nUp, nDown);

        for (T el : arr) {
            if (el.compareTo(nUp) <= 0 && el.compareTo(nDown) >= 0) {
                nInterval.add(el);
            }
        }

        return nInterval;
    }

}
