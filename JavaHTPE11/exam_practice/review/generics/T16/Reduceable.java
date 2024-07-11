package JavaHTPE11.exam_practice.review.generics.T16;


import JavaHTPE11.exam_practice.generics.testQuestion3.a.NonReduceable;

public interface Reduceable<T> {
    public T reduce() throws NonReduceable;
}

