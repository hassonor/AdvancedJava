package JavaHTPE11.ClassLesson6_generics.ex3;

import java.io.Serializable;

public class Pair<T extends Number & Serializable & Comparable>//!!!!
{
    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }

    private T first;
    private T second;
}
