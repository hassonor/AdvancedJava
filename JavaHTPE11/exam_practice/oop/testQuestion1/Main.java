package JavaHTPE11.exam_practice.oop.testQuestion1;

public class Main {
    public static void main(String[] args) {
        B b = new C();
        b.f(); // -> will print 'A'. dynamic binding doesn't work in static methods.
        ((B) new C()).f(); // -> will print 'A'. dynamic binding doesn't work in static methods.
    }
}
