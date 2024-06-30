package JavaHTPE11.exam_practice.exams.a2023_88.Q4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Storage {
    private String[] strings;
    private boolean[] encrypted;
    private int currentIndex;
    private ReentrantLock lock;
    private Condition allEncrypted;

    public Storage(String[] strings) {
        this.strings = strings;
        this.encrypted = new boolean[strings.length];
        this.currentIndex = 0;
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
            encrypted[data.getPos()] = true;
            if (allStringsEncrypted()) {
                allEncrypted.signalAll();
            }
        } finally {
            lock.unlock();
        }
    }

    public String[] getResult() {
        lock.lock();
        try {
            while (!allStringsEncrypted()) {
                allEncrypted.await();
            }
            return strings;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        } finally {
            lock.unlock();
        }
    }

    private boolean allStringsEncrypted() {
        for (boolean b : encrypted) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
