package JavaHTPE11.ClassLesson6_generics.ex9;

public class MainTest {
    public static void main(String[] args) {
        Integer test = 1;
        test(test);

        Double test2 = 2.0;
        test(test2);
    }

    private static <T> void test(T item) {
        System.out.println("Item on generic");
    }

    private static void test(Integer item) {
        System.out.println("Item on non-generic");
    }
}
