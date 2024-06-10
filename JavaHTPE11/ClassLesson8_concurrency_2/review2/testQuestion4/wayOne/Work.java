package JavaHTPE11.ClassLesson8_concurrency_2.review2.testQuestion4.wayOne;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Work {

    private final int MAX = 10;

    private int done = 0;
    private Lock lock = new ReentrantLock();
    private Condition isStageOneDone = lock.newCondition();

    public void stage1(int id) {
        System.out.println("Worker " + id + " finished stage 1");
        lock.lock();
        done++;
        try {
            if (done == MAX) {
                isStageOneDone.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }

    public void stage2(int id) {
        lock.lock();
        try {
            while (done != MAX) {
                isStageOneDone.await();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        } finally {
            lock.unlock();
        }
        System.out.println("Worker " + id + " finished stage 2");
    }

}
