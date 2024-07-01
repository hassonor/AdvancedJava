package JavaHTPE11.exam_practice.exams.a2022_24.Q1.A;

public class B extends A {
    public B(int n) {
        super(n);
    }

    public int f(B val) {
        System.out.print("in B ");
        setNum(val.getNum() * 2);
        return getNum();
    }
}
