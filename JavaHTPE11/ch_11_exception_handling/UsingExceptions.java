package JavaHTPE11.ch_11_exception_handling;

public class UsingExceptions {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception exception) {
            System.out.println("Exception handled in main");
        }

        doesNotThrowException();
    }

    public static void throwException() throws Exception {
        try { // throw an exception and immediately catch it
            System.out.println("Method throwException");
            throw new Exception(); // generate exception
        } catch (Exception exception) {
            System.out.println(
                    "Exception handled in method throwException");
            throw exception; // rethrow for further processing

            // code here would not be reached; would cause compilation errors
        } finally {
            System.out.println("Finally executed in throwException");
        }
    }

    public static void doesNotThrowException() {
        try {
            System.out.println("Method doesNotThrowException");
        } catch (Exception exception) {
            System.out.println(exception);
        } finally {
            System.out.println("Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
}
