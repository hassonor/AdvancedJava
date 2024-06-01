package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_4_paralleism_monitor_and_synchronized;

public class CashRegister {
    private int sum = 0;

    public synchronized void add(int toAdd) {
        sum += toAdd;
    }

    public synchronized int get() {
        return sum;
    }
}
