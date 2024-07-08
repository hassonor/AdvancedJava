package JavaHTPE11.exam_practice.exams.b2019_83.Q3;


import java.util.ArrayList;

public class Interval<T extends Comparable<T>> {
    private T down;
    private T up;
    private ArrayList<T> arr;

    public Interval(T down, T up) throws OutOfBoundsException {
        if (down.compareTo(up) > 0)
            throw new OutOfBoundsException();
        this.down = down;
        this.up = up;
        arr = new ArrayList<T>();
    }

    public void add(T item) throws OutOfBoundsException {
        if (item.compareTo(down) < 0 || item.compareTo(up) > 0)
            throw new OutOfBoundsException();

        if (!arr.contains(item))
            arr.add(item);
    }

    public Interval<T> subInterval(T newDown, T newUp) throws OutOfBoundsException {
        if (newDown.compareTo(down) < 0 || newUp.compareTo(up) > 0 || newDown.compareTo(newUp) > 0)
            throw new OutOfBoundsException();
        Interval<T> interval = new Interval<T>(newDown, newUp);

        for (T item : arr) {
            if (item.compareTo(newDown) >= 0 && item.compareTo(newUp) <= 0)
                interval.add(item);
        }

        return interval;

    }

}
