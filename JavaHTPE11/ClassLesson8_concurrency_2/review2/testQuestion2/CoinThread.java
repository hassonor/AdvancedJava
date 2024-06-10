package JavaHTPE11.ClassLesson8_concurrency_2.review2.testQuestion2;

public class CoinThread extends Thread {
    private int id;

    private Monitor m;

    public CoinThread(int id, Monitor m) {
        this.id = id;
        this.m = m;
    }

    @Override
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
        m.waitForMyPrint(id);
        System.out.println("thread " + id + " heads = " + head + " tails = " + tail);
        m.threadDone();
    }
}
