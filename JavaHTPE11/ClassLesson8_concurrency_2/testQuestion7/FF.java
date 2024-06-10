package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion7;

public class FF {
    public void foo() {
        System.out.println("foo");
        bar();
    }

    private void bar() {
        System.out.println("bar 1");
    }

}
