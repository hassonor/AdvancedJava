package JavaHTPE11.exam_practice.exams.b2019_83.Q4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BigData {
    double[] cells;
    private double max;
    private Lock[] locks;

    public BigData(int size, double max) {
        this.max = max;
        cells = new double[size];
        locks = new Lock[size];
        for (int i = 0; i < size; i++) {
            cells[i] = Math.random() * max;
            locks[i] = new ReentrantLock();
        }
    }

    public void multiple(int index, int val) {
        locks[index].lock();
        try {
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
            }
        } finally {
            locks[index].unlock();
        }
    }

}
