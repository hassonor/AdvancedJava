package JavaHTPE11.exam_practice.exams.a2018_93.Q1.B;

class MyException extends Exception {
}

public class ExpTest {
    private void f1() throws MyException {
        throw new MyException();
    }

    private void f2() throws MyException {
        f1();
    }
}
