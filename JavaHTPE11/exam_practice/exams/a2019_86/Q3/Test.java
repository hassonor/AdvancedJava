package JavaHTPE11.exam_practice.exams.a2019_86.Q3;

import JavaHTPE11.exam_practice.generics.testQuestion3.a.NonReduceable;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList<Reduceable> arr1 = new ArrayList<Reduceable>();
        ArrayList<X> arr2 = new ArrayList<X>();
        ArrayList<Y> arr3 = new ArrayList<Y>();
        ArrayList<Z> arr4 = new ArrayList<Z>();
        test1(arr1);
//        test1(arr2); // ! Compilation Error
//        test1(arr3); // ! Compilation Error
//        test1(arr4); // ! Compilation Error

        test2(arr1);
        test2(arr2);
        test2(arr3);
        test2(arr4);


    }

    public static void test1(ArrayList<Reduceable> arr) {
    }

    public static void test2(ArrayList<? extends Reduceable> arr) {
    }
}

class X implements Reduceable {

    @Override
    public void reduce() throws NonReduceable {

    }
}

class Y implements Reduceable {

    @Override
    public void reduce() throws NonReduceable {

    }
}

class Z implements Reduceable {

    @Override
    public void reduce() throws NonReduceable {

    }
}
