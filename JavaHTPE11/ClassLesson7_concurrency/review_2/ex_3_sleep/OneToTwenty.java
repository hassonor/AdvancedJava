package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_3_sleep;

public class OneToTwenty extends Thread {
    private final int MAX = 20;
    private String name;

    public OneToTwenty(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < MAX; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread " + name + " :" + i);
        }
    }
}
