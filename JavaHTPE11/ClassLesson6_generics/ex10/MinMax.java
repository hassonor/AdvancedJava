package JavaHTPE11.ClassLesson6_generics.ex10;

interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
} 