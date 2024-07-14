package JavaHTPE11.exam_practice.exams.b2018_83.Q1;

public class AMain {
    public static void main(String[] args) {
        A aa = new A() {
            private int a = 2;

            private void foo() {
                System.out.println(a + " " + b);
            }
        };
//        aa.foo();
        A a = new B();
//        B b = a;
//        a = new C();
        C c = a;
    }
}
