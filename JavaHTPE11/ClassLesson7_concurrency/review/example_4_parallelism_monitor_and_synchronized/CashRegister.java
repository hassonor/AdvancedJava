package JavaHTPE11.ClassLesson7_concurrency.review.example_4_parallelism_monitor_and_synchronized;

public class CashRegister {
    private int sum = 0;


    public synchronized void add(int toAdd) {

        sum += toAdd;
    }

    public synchronized int get() {
        return sum;
    }
}
