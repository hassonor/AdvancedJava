package JavaHTPE11.ClassLesson6_generics.ex2;

public class Pair<T, K> {
    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(K newValue) {
        second = newValue;
    }

    private T first;
    private K second;
}
