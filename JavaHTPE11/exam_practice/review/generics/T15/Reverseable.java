package JavaHTPE11.exam_practice.review.generics.T15;

import JavaHTPE11.exam_practice.exams.a2020_82.Q3.NonReverseable;

public interface Reverseable<T> {
    public T reverse() throws NonReverseable;
}
