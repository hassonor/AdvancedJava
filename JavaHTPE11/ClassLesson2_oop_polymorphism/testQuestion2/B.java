package JavaHTPE11.ClassLesson2_oop_polymorphism.testQuestion2;

public class B extends A {
//    public void f(A a) {
//        System.out.print("in B");
//        throw new java.io.IOException();
//    } ! Compilation Error

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        b.f(b);
        b.f(a);
    }
}
