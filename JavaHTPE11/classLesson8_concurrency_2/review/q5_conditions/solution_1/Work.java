package JavaHTPE11.classLesson8_concurrency_2.review.q5_conditions.solution_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Work {
    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private Condition isDone = lock.newCondition();

    private int size;

    private int current;

    public Work(int size) {
        this.size = size;
        current = 0;
    }

    public void stage1(int id) {
        System.out.println("worker " + id + " finished stage 1");
        lock.lock();
        current++;
        try {
            if (size == current) {
                condition.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }

    public void stage2(int id) {
        lock.lock();
        try {
            while (current != size)
                condition.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        System.out.println("worker " + id + " finished stage 2");
    }

}
