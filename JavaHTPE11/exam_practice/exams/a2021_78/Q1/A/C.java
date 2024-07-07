package JavaHTPE11.exam_practice.exams.a2021_78.Q1.A;

import java.util.Random;

public class C extends A {
    private int num2;
    private static final Random r = new Random();

    public C() {
        super(r.nextInt(11));
        num2 = (r.nextInt(11));
    }

    public boolean foo(C c) {
        System.out.println("C foo");
        return (c instanceof C) && c.num2 == num2;
    }
}
