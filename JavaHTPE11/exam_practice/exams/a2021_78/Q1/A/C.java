package JavaHTPE11.exam_practice.exams.a2021_78.Q1.A;

import java.util.Random;

public class C extends A {
    private int num2;

    public C() {
        super((new Random()).nextInt(11));
        num2 = (new Random()).nextInt(11);
    }

    public boolean foo(C c) {
        System.out.println("C foo");
        return (c instanceof C) && c.num2 == num2;
    }
}
