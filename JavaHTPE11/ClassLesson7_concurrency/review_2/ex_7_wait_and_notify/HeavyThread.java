package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_7_wait_and_notify;

public class HeavyThread extends Thread {
    private Monitor m = new Monitor();

    private int num;

    public HeavyThread(Monitor m, int num) {
        this.m = m;
        this.num = num;
    }

    @Override
    public void run() {
        super.run();
        m.waitForMyTurn(num);
        System.out.println("Thread: " + num + " processing.");
        m.imDone();
    }
}
