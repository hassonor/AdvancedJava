package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion4.wayOne;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;


public class Work {
    private Lock lock = new ReentrantLock();

    private Condition cond = lock.newCondition();
    private int size;

    private int done;

    public Work(int size){
        this.size =size;
    }
    public void stage1(int id){
        System.out.println("worker " + id + " finished stage 1");
        lock.lock();
        try {
            done++;
            if(done == size){
                cond.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }

    public void stage2(int id){
        lock.lock();
        try {
            while (done != size) {
                try {
                    cond.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        finally {
            lock.unlock();
        }

        System.out.println("worker " + id + " finished stage 2");
    }
}
