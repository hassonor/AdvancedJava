package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_5_parrallelism_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CashRegister {
    private int sum = 0;

    private Lock lock = new ReentrantLock();

    public void add(int toAdd) {
        lock.lock();

        try {
            sum += toAdd;
        } finally {
            lock.unlock();
        }
    }

    public int get() {
        lock.lock();
        try {
            return sum;
        } finally {
            lock.unlock();
        }

    }
}
