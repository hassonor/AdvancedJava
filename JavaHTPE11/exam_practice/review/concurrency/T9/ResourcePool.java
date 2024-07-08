package JavaHTPE11.exam_practice.review.concurrency.T9;

import JavaHTPE11.exam_practice.exams.b2021_98.Q4.Resource;

import java.util.ArrayList;

public class ResourcePool {
    private int free;
    private boolean[] inUse;
    private int[] totalUse;
    private ArrayList<Resource> arr;


    public ResourcePool(int n) {
        arr = new ArrayList<Resource>();
        free = n;
        inUse = new boolean[n + 1];
        totalUse = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            inUse[i] = false;
            totalUse[i] = 0;
        }
    }

    public synchronized Resource getResource() {
        while (free == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i < inUse.length; i++) {
            if (!inUse[i]) {
                inUse[i] = true;
                free--;
                totalUse[i]++;
                return arr.get(i - 1);
            }
        }

        return null;

    }

    public synchronized void returnResource(Resource e) {
        inUse[e.getId()] = false;
        arr.add(e);
        free++;
        notifyAll();
    }

    public synchronized int getUseCount(int id) {
        return totalUse[id];
    }

}
