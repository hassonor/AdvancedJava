package JavaHTPE11.ClassLesson8_concurrency_2.review.q3;

public class CoinThread extends Thread {
    private int id;

    private Monitor m;

    public CoinThread(Monitor m, int id) {
        this.m = m;
        this.id = id;
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
        m.waitForMyTurn(id);
        System.out.println("thread: " + id + " heads = " + head + " tails = " + tail);
        m.donePrint();
    }
}
