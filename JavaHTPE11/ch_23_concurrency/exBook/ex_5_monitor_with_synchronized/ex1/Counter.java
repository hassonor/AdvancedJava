package JavaHTPE11.ch_23_concurrency.exBook.ex_5_monitor_with_synchronized.ex1;

public class Counter {
    private int count = 0;

    public synchronized void inc() {
        count++;
    }

    public synchronized int get() {
        return count;
    }
}
