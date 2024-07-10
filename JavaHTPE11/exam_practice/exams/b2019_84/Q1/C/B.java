package JavaHTPE11.exam_practice.exams.b2019_84.Q1.C;

public class B extends A {
    public static void stat() {
        System.out.println("B.stat() ");
    }
    

    public static void main(String[] args) {
        B b = new B();
        b.foo();
        stat();
    }
}
