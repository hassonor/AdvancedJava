package JavaHTPE11.ClassLesson10.testQuestion1;

public class BB {
    public static void main(String[] args) {
        AA a = new AA() {
        };
        a.func();
        System.out.println(a instanceof AA);
    }
}
