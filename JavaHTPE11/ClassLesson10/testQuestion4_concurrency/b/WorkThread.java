package JavaHTPE11.ClassLesson10.testQuestion4_concurrency.b;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WorkThread extends Thread {
    private int[] vec;
    private int id;
    private int result;

    private static int print = 0;
    private static Lock lock = new ReentrantLock();

    private static Condition cond = lock.newCondition();

    public WorkThread(int[] vec, int id) {
        this.vec = vec;
        this.id = id;
    }

    public static synchronized int process(int[] vec, int id) {
        int result = 0;
        System.out.println("task" + id);
        for (int i = 0; i < vec.length; i++) {
            vec[i] = vec[i] + 1;
            result = result + vec[i];
        }

        return result;
    }

    @Override
    public void run() {
        super.run();
        result = process(vec, id);
        lock.lock();
        try {
            while (id != print) {
                try {
                    cond.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("task " + id + ",result=" + result);
            print++;
            cond.signalAll();
        } finally {
            lock.unlock();
        }
    }


}
