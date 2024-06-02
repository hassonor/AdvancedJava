package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_7_wait_and_notify;

public class Main {
    public static void main(String[] args) {
        HeavyThread[] hts = new HeavyThread[10];
        Monitor m = new Monitor();

        for (int i = 0; i < 10; i++) {
            hts[i] = new HeavyThread(m, i);
        }

        for (int i = hts.length - 1; i >= 0; i--) {
            hts[i].start();
        }

        m.allDone();
        System.out.println("MAIN DONE");
    }
}
