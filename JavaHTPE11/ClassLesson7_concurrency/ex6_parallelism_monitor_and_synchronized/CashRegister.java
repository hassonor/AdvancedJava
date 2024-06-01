package JavaHTPE11.ClassLesson7_concurrency.ex6_parallelism_monitor_and_synchronized;

public class CashRegister {
    private int sum = 0;

    private synchronized void add(int toAdd) {
        sum += toAdd;
    }

    private synchronized int get() {
        return sum;
    }
}
