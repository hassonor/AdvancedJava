package JavaHTPE11.ClassLesson7_concurrency.review.example_1_threads.re1;

public class OneToTwenty extends Thread {
    private final int MAX = 20;

    private String name;

    public OneToTwenty(String name) {
        this.name = name;
    }

    public void run() {
        super.run();
        for (int i = 1; i <= MAX; i++) {
            System.out.println("Thread " + name + ":" + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
