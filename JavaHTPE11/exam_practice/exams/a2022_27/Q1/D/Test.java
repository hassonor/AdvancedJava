package JavaHTPE11.exam_practice.exams.a2022_27.Q1.D;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(null);
        arr.add(8);
        test(arr);
    }

    public static void test(List<Integer> lst) {
        for (Integer i : lst) {
            try {
                System.out.print(i);
            } catch (NullPointerException e) {
                System.out.print("1");
            } finally {
                System.out.print("0");
            }
        }
    }
}
