package JavaHTPE11.exam_practice.exams.b2020_73.Q3;

import JavaHTPE11.exam_practice.generics.testQuestion3.a.NonReduceable;

public interface Reduceable<T> {
    public T reduce() throws NonReduceable;
}

