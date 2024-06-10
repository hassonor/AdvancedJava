package JavaHTPE11.ClassLesson8_concurrency_2.review2.testQuestion2;

public class Main {
    public static void main(String[] args) {
        CoinThread[] coinThreads = new CoinThread[10];
        Monitor m = new Monitor(10);

        for (int i = 0; i < 10; i++) {
            coinThreads[i] = new CoinThread(i, m);
        }

        for (int i = coinThreads.length - 1; i >= 0; i--) {
            coinThreads[i].start();
        }

        m.waitForAllDone();
        System.out.println("MAIN DONE");
    }
}
