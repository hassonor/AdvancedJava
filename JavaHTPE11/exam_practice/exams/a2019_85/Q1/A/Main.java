package JavaHTPE11.exam_practice.exams.a2019_85.Q1.A;

public class Main {
    public static void main(String[] args) {
        A y1 = new B(2);
        B y2 = new B(3);
        A z1 = new C(4);
        B z2 = new C(5);

//        System.out.println(y1.f(y2)); // in A 3
//        System.out.println(y1.f((A) y2));  // in A 3
//        System.out.println(y2.f(y1)); // in A 2
//        System.out.println(y2.f(z1)); // in A 4
//        System.out.println(z1.f(z2)); // in C 4
//        System.out.println(z1.f(y1)); // in C 3
//        System.out.println(z2.f(y1)); // in C 3
//        System.out.println(z2.f(y2)); // in B 6
//        System.out.println(z2.f((C) y1)); // ! Runtime Error
    }
}
