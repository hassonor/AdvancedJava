package JavaHTPE11.exam_practice.exams.a2022_24.Q1.A;

public class A {
    private int num;

    public A(int n) {
        num = n;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int n) {
        num = n;
    }

    public int f(A val) {
        System.out.print("in A ");
        num = val.num;
        return num;
    }
}
