package JavaHTPE11.ch_11_exception_handling.classBook.ex_1;

import java.io.IOException;

public class ExceptionExample1 {
    public int getData() {
        int message = 0;
        try {
            message = System.in.read();
            System.out.println("Successful read");
        } catch (IOException exception) {
            System.out.println("Unsuccessful read");
            message = -1;
        }
        return message;
    }

    public static void main(String[] args) {
        ExceptionExample1 app = new ExceptionExample1();
        int message = app.getData();
        System.out.println("data=" + message);
    }
}
