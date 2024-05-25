package JavaHTPE11.ClassLesson7_concurrency.ex7_parallelism_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CashRegister {

    private Lock lock = new ReentrantLock();
    private int sum = 0;


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
