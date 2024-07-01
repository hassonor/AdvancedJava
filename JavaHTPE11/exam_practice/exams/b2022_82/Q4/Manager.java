package JavaHTPE11.exam_practice.exams.b2022_82.Q4;

public class Manager {
    private int free;
    private final boolean[] usedResources;
    private int numOfAllocation;

    public Manager(int num) {
        free = num;
        usedResources = new boolean[num];
    }

    public synchronized int allocate() {
        while (free == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < usedResources.length; i++) {
            if (!usedResources[i]) {
                usedResources[i] = true;
                free--;
                numOfAllocation++;
                notifyAll();
                return i;
            }
        }

        return -1;
    }

    public synchronized void free(int index) {
        if (index >= 0 && index < usedResources.length && usedResources[index]) {
            usedResources[index] = false;
            free++;
            notifyAll();
        }
    }

    public synchronized void waitCount(int x) {
        while (x != numOfAllocation) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}