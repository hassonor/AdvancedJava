package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion5.solution_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Work {
    private final int MAX = 10;
    private int done = 0;

    private Lock lock = new ReentrantLock();

    private Condition cond = lock.newCondition();

    public void stage1(int id) {
        lock.lock();
        System.out.println("worker " + id + " finished stage 1");
        done++;
        try {
            if (done == MAX)
                cond.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void stage2(int id) {
        lock.lock();
        try {
            while (done != MAX) {
                cond.await();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        System.out.println("worker " + id + " finished stage 2");
    }

}
