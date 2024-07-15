package JavaHTPE11.exam_practice.exams.a2024_86.Q1.A;

public class Main {
    public static void main(String[] args) {
        Question q1 = new Question("xxx");
        Question q2 = new FullQuestion("yyy", "abc");

        System.out.println(q1.hint(q2)); // Question: xxx yyy
        System.out.println(q2.hint(q1)); // FullQuestion: yyy xxx abc
        System.out.println(q2.hint(q2)); // FullQuestion: yyy yyy abc
        System.out.println(((Question) q2).hint(q2)); // FullQuestion: yyy yyy abc

        Question b1 = new Question("xxx");
        FullQuestion b2 = new FullQuestion("yyy", "abc");
        Question b3 = new Answer("zzz", "ans1");
        Answer b4 = new Answer("www", "ans2");

        System.out.println(b1.hint(b3)); // Question: xxx zzz
        System.out.println(b3.hint(b1)); // Not Answer xxx
        System.out.println(b2.hint(b3)); // FullQuestion: yyy ans1 abc
        System.out.println(b4.hint((Question) b3)); // Answer ans2
    }
}
