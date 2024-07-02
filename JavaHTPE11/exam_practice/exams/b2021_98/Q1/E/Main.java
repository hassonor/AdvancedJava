package JavaHTPE11.exam_practice.exams.b2021_98.Q1.E;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Object c = new A();

        method(a);
        method(b);
        method((A) c);

    }

    public static void method(A a) {
        B b = (B) a;
    }
}
