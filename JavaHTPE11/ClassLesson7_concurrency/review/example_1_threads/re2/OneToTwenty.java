package JavaHTPE11.ClassLesson7_concurrency.review.example_1_threads.re2;

public class OneToTwenty implements Runnable {
    private final int MAX = 20;

    private String name;

    public OneToTwenty(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= MAX; i++) {
            System.out.println("Thread " + name + ":" + i);
        }
    }
}
