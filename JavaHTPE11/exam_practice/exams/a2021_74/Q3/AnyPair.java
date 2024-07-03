package JavaHTPE11.exam_practice.exams.a2021_74.Q3;

public class AnyPair<T, E> {
    private T one;
    private E two;

    public AnyPair(T one, E two) throws Exception {
        if (one == null || two == null)
            throw new Exception();
        this.one = one;
        this.two = two;
    }

    public AnyPair() {
        this.one = null;
        this.two = null;
    }

    public T getFirst() {
        return one;
    }

    public E getSecond() {
        return two;
    }

 
}