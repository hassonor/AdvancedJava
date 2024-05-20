package JavaHTPE11.ClassLesson6_generics.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pair<Boolean> p2 = new Pair<Boolean>();
        p2.setFirst(true);
//		p2.setSecond(42); // compile error
        int x = 88;
        Pair<Integer> p3 = new Pair<Integer>();
        p3.setFirst(44);
//		p3.setSecond(x);
        ArrayList<Student> list = new ArrayList<Student>();
        Pair<Student> p4 = new Pair<Student>();
//		p4.setFirst(39);
//		Pair <int> p5 = new Pair<int>();

    }

}
