package JavaHTPE11.ClassLesson7_concurrency.review3.ex4_parallelism_synchronized;

public class CashRegister {
    private int sum = 0;

    public synchronized void add(int toAdd) {
        sum += toAdd;
    }

    public synchronized int get() {
        return sum;
    }
}
