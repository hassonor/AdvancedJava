package JavaHTPE11.exam_practice.exams.a2022_27.Q1.C;

public class Foo {
    private int data;

    class Foo1 {
        private int d = data++;

        public int getD() {
            return d;
        }
    }

    public Object f() {
        Foo1 foo1 = new Foo1();
        return foo1;
    }
}
