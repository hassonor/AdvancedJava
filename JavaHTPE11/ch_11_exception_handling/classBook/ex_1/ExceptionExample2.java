package JavaHTPE11.ch_11_exception_handling.classBook.ex_1;

import java.io.IOException;

public class ExceptionExample2 {
    public int getData() throws IOException {
        int message = -1;
        message = System.in.read();
        return message;
    }

    public static void main(String[] args) {
        int message = 0;
        ExceptionExample2 app = new ExceptionExample2();
        try {
            app.getData();
            System.out.println("data=" + message);
        } catch (IOException exception) {
            System.out.println("Unsuccessful read");
        }
    }
}
