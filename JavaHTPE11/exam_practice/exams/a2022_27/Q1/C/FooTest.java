package JavaHTPE11.exam_practice.exams.a2022_27.Q1.C;

public class FooTest {
    public static void main(String[] args) {
        Object o = new Foo().f();
        Foo.Foo1 foo1 = (Foo.Foo1) o;
        System.out.println(foo1.getD());
    }
}
