package JavaHTPE11.exam_practice.review.generics.T17;

import JavaHTPE11.ClassLesson10.testQuestion3_generics.a.IllegalDataException;

public class Interval<T extends Comparable<T>> {
    private T lower;
    private T upper;

    public Interval(T limit1, T limit2) throws IllegalDataException {
        if (limit1.compareTo(limit2) == 0)
            throw new IllegalDataException();

        else if (limit1.compareTo(limit2) > 0) {
            upper = limit1;
            lower = limit2;
        } else {
            upper = limit2;
            lower = limit1;
        }
    }

    public T getLower() {
        return lower;
    }

    public T getUpper() {
        return upper;
    }
}
