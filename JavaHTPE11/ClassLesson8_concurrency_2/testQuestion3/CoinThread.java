package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion3;

public class CoinThread extends Thread {
    private int id;

    private Monitor m;

    public CoinThread(int id, Monitor m) {
        this.id = id;
        this.m = m;
    }

    public void run() {
        super.run();
        int head = 0, tail = 0;
        for (int i = 0; i < 100; i++) {
            if ((Math.random() < 0.5)) {
                head++;
            } else {
                tail++;
            }
        }
        m.waitForPrint(id);
        System.out.println("thread: " + id + " heads = " + head + " tail = " + tail);
        m.donePrint();
    }
}
