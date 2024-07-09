package JavaHTPE11.exam_practice.exams.a2018_83.Q4;


import JavaHTPE11.exam_practice.exams.b2021_98.Q4.Resource;

import java.util.ArrayList;

public class ResourcePool {
    private ArrayList<Resource> resources;
    private int free;
    private boolean[] useResources;
    private int[] useCount;


    public ResourcePool(int n) {
        resources = new ArrayList<Resource>();
        free = n;
        useCount = new int[n + 1];
        useResources = new boolean[n + 1];
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
        for (int i = 1; i < useResources.length; i++) {
            if (!useResources[i]) {
                useResources[i] = true;
                free--;
                useCount[i]++;
                return resources.get(i - 1);
            }
        }

        return null;
    }

    public synchronized void returnResource(Resource r) {
        useResources[r.getId()] = false;
        free++;
        notifyAll();
    }

    public synchronized int getUseCount(int num) {
        return useCount[num];
    }

}
