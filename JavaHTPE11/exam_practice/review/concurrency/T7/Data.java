package JavaHTPE11.exam_practice.review.concurrency.T7;

import java.util.*;
import java.util.concurrent.locks.*;

public class Data {
    private ArrayList<Integer> nums = new ArrayList<Integer>();
    private Lock[] locks;

    public Data() {
        locks = new Lock[100];
        for (int i = 0; i < 100; i++) {
            nums.add((int) (Math.random() * 100));
            locks[i] = new ReentrantLock();
        }
    }

    public void update(int i) {
        locks[i].lock();
        try {
            int num = nums.get(i);
            if (num < 100) nums.set(i, num + 1);
            else nums.set(i, (int) (Math.random() * 100));
        } finally {
            locks[i].unlock();
        }
    }

    public int get(int i) {
        locks[i].lock();
        try {
            return nums.get(i);
        } finally {
            locks[i].unlock();
        }
    }
}
