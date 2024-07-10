package JavaHTPE11.exam_practice.exams.b2018_93.Q1.A;

public class AMain {
    public static void main(String[] args) {
        final int a = 1;
        A aa = new A() {
            private int a = 2;

            public void foo() {
                System.out.println(a + " " + b + " ");
            }

            public void moo() {
                System.out.println(a + " " + b);
            }
        };
        aa.foo();
//        aa.moo(); ! Compilation Error
    }

}
