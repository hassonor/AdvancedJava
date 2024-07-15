package JavaHTPE11.exam_practice.exams.a2024_89.Q4;

public class Test {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E'};
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new PrintThread(chars[i], i + 1));
            threads[i].start();
        }

        System.out.print("main");
    }
}
