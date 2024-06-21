package JavaHTPE11.exam_practice.oop.testQuestion2;

public class MyException2 extends MyException1 {
    public static void main(String[] args) {
        Q q = new Q();
        try {
            q.f();
        } catch (MyException2 e) {
            System.out.println("2");
        } catch (MyException1 e) {
            System.out.println("1");
        }
    }
}




