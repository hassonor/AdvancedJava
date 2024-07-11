package JavaHTPE11.exam_practice.review.concurrency.T17;

public class Test {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        Monitor m = new Monitor(3);
        for (int i = 0; i < 3; i++) {
            new WorkThread(data, i, m).start();
        }

        System.out.println("**main**");
    }
}
