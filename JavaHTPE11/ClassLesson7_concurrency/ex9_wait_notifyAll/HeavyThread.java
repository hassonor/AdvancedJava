package JavaHTPE11.ClassLesson7_concurrency.ex9_wait_notifyAll;

public class HeavyThread extends Thread {
    private MyMonitor mm;

    private int num;

    public HeavyThread(int n, MyMonitor mm) {
        this.mm = mm;
        this.num = n;
    }

    @Override
    public void run() {
        super.run();
        mm.waitForMyTurn(num);
        System.out.println("I'm doing something: " + num);
        mm.imDone();
    }
}
