package JavaHTPE11.exam_practice.review.concurrency.T15.wayTwo;

public class Test {
    public static void main(String[] args) {
        int[] vec = {1, 2, 3, 4};
        WorkThread[] workers = new WorkThread[3];
        for (int i = 0; i < 3; i++) {
            workers[i] = new WorkThread(vec, i);
        }

        for (int i = 0; i < 3; i++) {
            workers[i].start();
        }
        System.out.println("**main**");
    }
}
