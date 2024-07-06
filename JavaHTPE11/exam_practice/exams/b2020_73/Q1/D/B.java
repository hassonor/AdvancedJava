package JavaHTPE11.exam_practice.exams.b2020_73.Q1.D;


public class B {
    public static void main(String[] args) {
        A aa = new A() {
            private int a = 2;

            public void foo() {
                System.out.println(a);
                System.out.println(b);
            }
        };
    }

}
