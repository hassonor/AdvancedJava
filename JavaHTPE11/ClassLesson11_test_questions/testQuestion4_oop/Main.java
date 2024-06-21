package JavaHTPE11.ClassLesson11_test_questions.testQuestion4_oop;

public class Main {
    public static void main(String[] args) {
        func(new Z(), new Z());
        funA(4);
    }

    public static void func(X a, Y b) {
        System.out.println("first");
    }

    public static void func(Y a, X b) {
        System.out.println("second");
    }

    public static void func(Y a, Y b) {
        System.out.println("third");
    }

    public static <T> void funA(T x) {

    }

    // If we remove the third method the code won't compile
    // If we change to func(new X(), new X()) the code won't compile
}
