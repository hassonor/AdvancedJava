package JavaHTPE11.exam_practice.exams.a2023_88.Q4.firstWay;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Storage {
    private String[] strings;
    private boolean[] encrypted;
    private int currentIndex;
    private int encryptedCount;
    private final ReentrantLock lock;
    private final Condition allEncrypted;

    public Storage(String[] strings) {
        this.strings = strings;
        this.encrypted = new boolean[strings.length];
        this.currentIndex = 0;
        this.encryptedCount = 0;
        this.lock = new ReentrantLock();
        this.allEncrypted = lock.newCondition();
    }

    public Data getData() {
        lock.lock();
        try {
            if (currentIndex >= strings.length) {
                return null;
            }
            Data data = new Data(currentIndex, strings[currentIndex]);
            currentIndex++;
            return data;
        } finally {
            lock.unlock();
        }
    }

    public void setData(Data data) {
        lock.lock();
        try {
            strings[data.getPos()] = data.getText();
            if (!encrypted[data.getPos()]) {
                encrypted[data.getPos()] = true;
                encryptedCount++;
            }
            if (encryptedCount == strings.length) {
                allEncrypted.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }

    public String[] getResult() {
        lock.lock();
        try {
            while (encryptedCount < strings.length) {
                allEncrypted.await();
            }
            return strings;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted");
            return null;
        } finally {
            lock.unlock();
        }
    }
}