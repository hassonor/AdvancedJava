package JavaHTPE11.ch_23_concurrency.exBook.ex7_lock;

public class Worker implements Runnable {

    private Counter counter;

    private int times = 100;

    public Worker(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            counter.inc();
            try {
                Thread.sleep((int) (Math.random() * 10));
            } catch (InterruptedException exception) {
                System.out.println("Interrupted");
            }
        }
    }
}
