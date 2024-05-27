package JavaHTPE11.ClassLesson7_concurrency.review.example_2_join.re1;

public class OneToTwenty extends Thread {
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
