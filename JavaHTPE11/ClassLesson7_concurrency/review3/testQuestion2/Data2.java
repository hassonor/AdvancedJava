package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Data2 {
    private double[] cells;
    private double max;

    private Lock[] locks;

    private Condition[] conditions;
    public Data2(int size, double max){
        this.max = max;
        locks = new Lock[size];
        conditions = new Condition[size];
        cells = new double[size];
        for(int i = 0; i < size;i++){
            cells[i] = Math.random()*max;
            locks[i] = new ReentrantLock();
            conditions[i] = locks[i].newCondition();
        }
    }

    public  void multiply(int index, int val){
        locks[index].lock();
        try {
            while (cells[index] * val >= max) {
                try {
                    conditions[index].await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            cells[index] = cells[index] * val;
        }
        finally {
            locks[index].unlock();
        }
    }

    public void divide(int index, int val){
        locks[index].lock();
        try {
            if (val > 0) {
                cells[index] = cells[index] / val;
                conditions[index].signalAll();
            }
        }
        finally {
            locks[index].unlock();
        }
    }
}
