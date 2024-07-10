package JavaHTPE11.exam_practice.exams.a2018_93.Q1.C;

public class XYTest {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        x.func(3);
        x.func("text");
        y.func(3);
        y.func("text");

        System.out.println();
        Y2 y2 = new Y2();
        y2.func(3);
        y2.func(Integer.valueOf(3));
        y2.func(y);


    }
}
