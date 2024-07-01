package JavaHTPE11.exam_practice.exams.a2022_24.Q1.A;

public class C extends B {
    public C(int n) {
        super(n);
    }

    public int f(A val) {
        System.out.print("in C ");
        if (val instanceof C) return val.getNum() + 1;
        else return super.f(val);
    }
}
