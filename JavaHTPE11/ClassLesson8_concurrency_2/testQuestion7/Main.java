package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion7;

public class Main {
    public static void main(String[] args) {
        JavaHTPE11.classLesson8_concurrency_2.testQuestion7.FF f = new JavaHTPE11.classLesson8_concurrency_2.testQuestion7.FF() {
            private void bar() { // Doesn't override because bar is private
                System.out.println("bar 2");
            }
        };
        f.foo();
    }
}
