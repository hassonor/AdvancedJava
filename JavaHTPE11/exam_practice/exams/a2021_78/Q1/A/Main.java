package JavaHTPE11.exam_practice.exams.a2021_78.Q1.A;

public class Main {
    public static void main(String[] args) {
        A y1 = new B(100);
        B y2 = new B(100);
        A z1 = new C();
        C z2 = new C();

//        System.out.println(y1.foo(y2)); // A foo false
//        System.out.println(y1.foo((A) y2)); // A foo false
//        System.out.println(y2.foo(y1)); // A foo false
//        System.out.println(y2.foo(z1)); // A foo true
//        System.out.println(z1.foo(z2)); // A foo true/false
//        System.out.println(z1.foo(y1)); // A foo false
//        System.out.println(z1.foo(z2)); // A foo true/false
//        System.out.println(z2.foo((C) y1)); ! Running Error
    }
}
