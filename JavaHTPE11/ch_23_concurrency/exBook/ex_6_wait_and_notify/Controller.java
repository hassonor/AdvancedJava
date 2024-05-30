package JavaHTPE11.ch_23_concurrency.exBook.ex_6_wait_and_notify;

public class Controller {
    private int num; // number of threads to wait for
    private int count = 0; // number of threads finished

    public Controller(int num) {
        this.num = num;
    }

    public synchronized void finished() {
        count++;
        if (count >= num) notify();
    }

    public synchronized void waitForThreads() {
        while (count < num) {
            try {
                wait();
            } catch (InterruptedException exception) {
                System.out.println("Interrupter while waiting");
            }
        }
    }
}
