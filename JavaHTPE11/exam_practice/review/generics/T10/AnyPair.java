package JavaHTPE11.exam_practice.review.generics.T10;

public class AnyPair<T, V> {
    T one;
    V two;

    public AnyPair(T one, V two) throws Exception {
        if (one == null || two == null)
            throw new Exception();
        this.one = one;
        this.two = two;
    }

    public AnyPair() {
        this.one = null;
        this.two = null;
    }

    public T getOne() {
        return one;
    }

    public V getTwo() {
        return two;
    }


}
