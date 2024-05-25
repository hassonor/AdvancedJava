package JavaHTPE11.ClassLesson7_concurrency.ex6_parallelism_monitor_and_synchronized;

public class Teller extends Thread {
    private CashRegister c;
    private final int MAX = 20;

    public Teller(CashRegister c) {
        this.c = c;
    }

    public void run() {
        super.run();
        for (int i = 0; i < MAX; i++) {
            c.add(i);
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
