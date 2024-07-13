package JavaHTPE11.exam_practice.review.concurrency.T23;

import java.util.ArrayList;

public class ResourcePool {
    private ArrayList<Resource> arr;
    private int[] totalInUse;

    public ResourcePool(int size) {
        arr = new ArrayList<Resource>();
        totalInUse = new int[size + 1];
        for (int i = 0; i < size; i++) {
            arr.add(new Resource(i + 1));
        }
    }

    public synchronized Resource getResource() {
        while (arr.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Resource r = arr.remove(0);
        totalInUse[r.getId()]++;
        return r;
    }

    public synchronized void returnResource(Resource r) {
        arr.add(r);
        notifyAll();
    }

    public synchronized int getUseCount(int id) {
        return totalInUse[id];
    }
}


