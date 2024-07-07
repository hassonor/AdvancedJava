package JavaHTPE11.exam_practice.review.concurrency.T5.secondWay;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WorkThread extends Thread {
    private int[] vec;
    private int id;
    private int result;
    private static int nextTurn = 0;
    private static Lock lock = new ReentrantLock();
    private static Condition cond = lock.newCondition();

    public WorkThread(int[] vec, int id) {
        this.vec = vec;
        this.id = id;
    }

    public static synchronized int process(int[] vec, int id) {
        int result = 0;
        for (int i = 0; i < vec.length; i++) {
            vec[i] = vec[i] + 1;
            result = result + vec[i];
        }

        return result;
    }

    public void run() {
        result = process(vec, id);
        lock.lock();
        try {
            while (id > nextTurn) {
                try {
                    cond.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("task" + id + " result=" + result);
            nextTurn++;
            cond.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

