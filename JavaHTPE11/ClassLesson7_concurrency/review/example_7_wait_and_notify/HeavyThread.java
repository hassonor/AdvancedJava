package JavaHTPE11.ClassLesson7_concurrency.review.example_7_wait_and_notify;

public class HeavyThread extends Thread {
    private Monitor m;

    private int threadNumber;

    public HeavyThread(Monitor m, int threadNumber) {
        this.m = m;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        super.run();
        m.waitForMyTurn(threadNumber);
        System.out.println("I'm doing something: " + threadNumber);
        m.iAmDone();
    }
}
