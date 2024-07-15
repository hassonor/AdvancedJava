package JavaHTPE11.exam_practice.exams.a2024_89.Q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Code> arr = new ArrayList<Code>();
        arr.add(new Code('a', 'b', 'c'));
        arr.add(new Code('d', 'e', 'f'));
        arr.add(new Code('g', 'h', 'i'));

        ArrayList<Code> cpyArr = new ArrayList<Code>();
        for (Code c : arr) {
            try {
                cpyArr.add((Code) c.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        SubCode c1 = new SubCode('a', 'b', 'c', new Point(1, 2));
        SubCode c2 = null;
        try {
            c2 = (SubCode) c1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
