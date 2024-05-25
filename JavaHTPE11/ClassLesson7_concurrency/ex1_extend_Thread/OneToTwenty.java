package JavaHTPE11.ClassLesson7_concurrency.ex1_extend_Thread;

public class OneToTwenty extends Thread {
    private final int MAX = 20;
    private String name;

    public OneToTwenty(String name) {
        this.name = name;
    }

    public void run() {
        super.run();
        for (int i = 0; i < MAX; i++) {
            System.out.println("Thread " + name + " :" + i);
        }
    }
}
