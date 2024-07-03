package JavaHTPE11.exam_practice.exams.b2021_98.Q4;

import java.util.ArrayList;

public class ResourcePool {
    private int free;
    private ArrayList<Resource> resources;
    private boolean[] inUse;
    private int[] inUseCount;

    public ResourcePool(int n) {
        free = n;
        resources = new ArrayList<Resource>();
        inUse = new boolean[n + 1];
        inUseCount = new int[n + 1];

        for (int i = 0; i < n; i++) {
            resources.add(new Resource(i + 1));
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
                inUseCount[i]++;
                return resources.get(i - 1);
            }
        }

        return null;
    }

    public synchronized void returnResource(Resource r) {
        int id = r.getId();
        if (id >= 1 && id < inUse.length && inUse[id]) {
            inUse[id] = false;
            free++;
            notifyAll();
        }
    }

    public synchronized int getUseCount(int num) {
        if (num >= 1 && num < inUseCount.length) {
            return inUseCount[num];
        }
        return -1;
    }
}
