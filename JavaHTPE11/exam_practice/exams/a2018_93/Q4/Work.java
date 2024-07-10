package JavaHTPE11.exam_practice.exams.a2018_93.Q4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Work {
    private Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();
    private int size;
    private int done;

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
