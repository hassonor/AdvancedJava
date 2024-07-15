package JavaHTPE11.exam_practice.exams.a2024_89.Q4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintThread implements Runnable {
    private char c;
    private int n;
    private static Lock lock = new ReentrantLock();
    private static Condition cond = lock.newCondition();
    private static int nextTurn = 1;

    public PrintThread(char c, int n) {
        this.c = c;
        this.n = n;
    }

    public void print(char c, int n) {
        lock.lock();
        try {
            while (nextTurn != n) {
                try {
                    cond.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(c);
            }
            nextTurn++;
            cond.signalAll();
        } finally {
            lock.unlock();
        }
        ;
    }

    @Override
    public void run() {
        print(c, n);
    }
}
