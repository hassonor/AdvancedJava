package JavaHTPE11.exam_practice.generics.testQuestion7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transportation> list = new ArrayList<Transportation>();
        ArrayList<Motor> list2 = new ArrayList<Motor>();

        Transportation t = new Transportation();
        // list2.add(t); // Compilation Error
        list2.add(new Car());
        list2.add(new Motor());
        list.add(new Transportation());
        list.add(new Car());
        list.add(new Motor());

        list.add(new Transportation());


    }
}
