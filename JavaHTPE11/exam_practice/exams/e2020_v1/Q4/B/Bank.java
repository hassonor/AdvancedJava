package JavaHTPE11.exam_practice.exams.e2020_v1.Q4.B;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private double[] accounts;
    private Lock[] locks;

    public Bank(int size, double initialBalance) {
        accounts = new double[size];
        locks = new Lock[size];
        for (int i = 0; i < size; i++) {
            accounts[i] = initialBalance;
            locks[i] = new ReentrantLock();
        }
    }

    public boolean transfer(int from, int to, double amount) {
        locks[from].lock();
        locks[to].lock();
        try {
            accounts[from] = accounts[from] - amount;
            accounts[to] = accounts[to] + amount;
            notifyAll();
            return true;
        } finally {
            locks[from].unlock();
            locks[to].unlock();
        }
    }

    public int size() {
        return accounts.length;
    }

}