package JavaHTPE11.exam_practice.review.concurrency.T28;

import java.util.concurrent.locks.*;

public class Work {
    private int done;
    private int size;
    private Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();

    public Work(int size) {
        this.size = size;
    }

    public void stage1(int id) {
        lock.lock();
        try {
            System.out.println("worker" + id + " finished stage1");
            done++;
            if (done == size)
                cond.signalAll();
        } finally {
            lock.unlock();
        }
        ;
    }

    public void stage2(int id) {
        lock.lock();
        try {
            while (done != size) {
                try {
                    cond.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("worker" + id + " finished stage2");
        } finally {
            lock.unlock();
        }
    }
}
