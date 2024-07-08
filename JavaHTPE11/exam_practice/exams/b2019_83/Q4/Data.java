package JavaHTPE11.exam_practice.exams.b2019_83.Q4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Data {
    private double[] cells;
    private double max;
    private Lock[] locks;
    private Condition[] cond;

    public Data(int size, double max) {
        this.max = max;
        cells = new double[size];
        locks = new Lock[size];
        cond = new Condition[size];
        for (int i = 0; i < size; i++) {
            cells[i] = Math.random() * max;
            locks[i] = new ReentrantLock();
            cond[i] = locks[i].newCondition();
        }
    }

    public void multiple(int index, int val) {
        locks[index].lock();
        try {
            while (cells[index] * val >= max) {
                try {
                    cond[index].await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            cells[index] = cells[index] * val;
        } finally {
            locks[index].unlock();
        }
    }

    public void divide(int index, int val) {
        locks[index].lock();
        try {
            if (val > 0) {
                cells[index] = cells[index] / val;
                cond[index].signalAll();
            }
        } finally {
            locks[index].unlock();
        }
    }

}
