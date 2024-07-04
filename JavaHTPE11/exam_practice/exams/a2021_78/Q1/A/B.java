package JavaHTPE11.exam_practice.exams.a2021_78.Q1.A;

public class B extends A {
    public B(int num) {
        super(num);
    }

    public boolean foo(B b) {
        System.out.println("B foo");
        return getNum() == b.getNum();
    }
}
