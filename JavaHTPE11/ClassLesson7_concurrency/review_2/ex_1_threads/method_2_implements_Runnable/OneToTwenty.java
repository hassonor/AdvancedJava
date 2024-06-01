package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_1_threads.method_2_implements_Runnable;

public class OneToTwenty implements Runnable {

    private final int MAX = 20;
    private String name;

    public OneToTwenty(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX; i++) {
            System.out.println("Thread " + name + " :" + i);
        }
    }
}
