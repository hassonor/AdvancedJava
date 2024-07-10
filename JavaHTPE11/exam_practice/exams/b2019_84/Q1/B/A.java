package JavaHTPE11.exam_practice.exams.b2019_84.Q1.B;

public class A {
    private int i = 1;
    public int j = 2;

    public class B {
        private int i = 0;
        public int j = 0;

        public B(int i) {
            this.i = i;
            A.this.i = i;
        }
    }
}
