package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion3;

public class Main {
    public static void main(String[] args) {
        Monitor m = new Monitor(10);
        CoinThread[] ct = new CoinThread[10];

        for (int i = 0; i < ct.length; i++) {
            ct[i] = new CoinThread(i, m);
        }

        for (int j = 0; j < ct.length; j++) {
            ct[j].start();
        }

        m.waitForAll();
        System.out.println("MAIN DONE");
    }
}
