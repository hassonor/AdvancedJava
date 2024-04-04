package JavaHTPE11.ch_11_exception_handling;

public class UsingChainedExceptions {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    // call method2; throw exceptions back to main
    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("Exception throws in method1", exception);
        }
    }

    // call method3; throw exception back to method1
    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception exception) {
            throw new Exception("Exception throws in method2", exception);
        }
    }

    // throw Exception back to method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
