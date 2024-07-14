package JavaHTPE11.exam_practice.review.concurrency.T28;

public class Test {
    public static void main(String[] args) {
        Work w = new Work(10);
        Worker[] workers = new Worker[10];
        for (int i = 0; i < 10; i++) {
            workers[i] = new Worker(i + 1, w);
        }
        for (int i = 0; i < 10; i++) {
            workers[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                workers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All Workers Done");
    }
}
