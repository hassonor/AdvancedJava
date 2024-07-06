package JavaHTPE11.exam_practice.exams.b2022_82.Q1;

public class Main {
    public static void main(String[] args) {
        try {
            Code myCode = new Code("Hello World");
            SubCode mySubcode = new SubCode("java");
            mySubcode.encode();
            System.out.println(mySubcode);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
