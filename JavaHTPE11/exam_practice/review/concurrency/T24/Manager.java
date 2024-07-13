package JavaHTPE11.exam_practice.review.concurrency.T24;

import java.util.concurrent.locks.*;

public class Manager {
    private int[][] mat;
    private int current;
    private int done, sum;
    private Lock lock;
    private Condition condition;


    public Manager(int[][] mat) {
        this.mat = mat;
        lock = new ReentrantLock();
        condition = lock.newCondition();
    }

    public synchronized int[] allocateRow() {
        if (current == mat.length)
            return null;
        return mat[current++];
    }

    public synchronized void addSum(int sum) {
        this.sum += sum;
        done++;
        notifyAll();
    }

    public synchronized int getTotal() {
        while (done != mat.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }

}
