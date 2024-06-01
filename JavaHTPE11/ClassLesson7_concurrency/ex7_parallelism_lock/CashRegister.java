package JavaHTPE11.ClassLesson7_concurrency.ex7_parallelism_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CashRegister {

    private Lock lock = new ReentrantLock();
    private int sum = 0;


    private void add(int toAdd) {
        lock.lock();
        try {
            sum += toAdd;
        } finally {
            lock.unlock();
        }
    }

    private int get() {
        lock.lock();
        try {
            return sum;
        } finally {
            lock.unlock();
        }
    }
}
