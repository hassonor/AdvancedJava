package JavaHTPE11.ClassLesson8_concurrency_2.review.q3;

public class Main {
    public static void main(String[] args) {
        CoinThread[] ct = new CoinThread[10];
        Monitor m = new Monitor(10);

        for (int i = 0; i < 10; i++) {
            ct[i] = new CoinThread(m, i);
        }

        for (int i = ct.length - 1; i >= 0; i--) {
            ct[i].start();
        }

        m.allDone();

        System.out.println("MAIN DONE");

    }
}
