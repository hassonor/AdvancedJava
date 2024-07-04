package JavaHTPE11.exam_practice.exams.a2021_78.Q1.A;

public class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean foo(A a) {
        System.out.println("A foo");
        return getNum() >= a.getNum();
    }

}
