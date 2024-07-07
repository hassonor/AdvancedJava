package JavaHTPE11.exam_practice.exams.b2020_76.Q3;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

import java.util.ArrayList;

public class Interval<T extends Comparable<T>> {
    private T lower;
    private T upper;
    private ArrayList<T> arr;


    public Interval(T lower, T upper) throws IllegalDataException {
        if (lower.compareTo(upper) == 0)
            throw new IllegalDataException();

        else if (lower.compareTo(upper) < 0) {
            this.lower = lower;
            this.upper = upper;
        } else {
            this.lower = upper;
            this.upper = lower;
        }

        arr = new ArrayList<T>();
    }

    public T getLower() {
        return lower;
    }

    public T getUpper() {
        return upper;
    }

}
