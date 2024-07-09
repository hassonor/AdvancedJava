package JavaHTPE11.exam_practice.review.generics.T5;

import JavaHTPE11.exam_practice.exams.a2022_27.Q3.NonCodeable;

public interface Codeable<T> {
    public T code() throws NonCodeable;
}
