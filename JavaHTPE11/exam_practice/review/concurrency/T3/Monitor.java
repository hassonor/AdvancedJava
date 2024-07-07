package JavaHTPE11.exam_practice.review.concurrency.T3;

public class Monitor {
    private int freeResources;
    private boolean[] resourcesInUse;
    private int x;
    private int numOfAllocates;

    public Monitor(int n, int x) {
        this.x = x;
        freeResources = n;
        resourcesInUse = new boolean[n];
    }

    public synchronized int allocate() {
        while (freeResources == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < resourcesInUse.length; i++) {
            if (!resourcesInUse[i]) {
                resourcesInUse[i] = true;
                freeResources--;
                numOfAllocates++;
                if (x == numOfAllocates)
                    notifyAll();
                return i;
            }
        }

        return -1;

    }

    public synchronized void free(int index) {
        resourcesInUse[index] = false;
        freeResources++;
        notifyAll();
    }

    public synchronized void waitCount() {
        while (x != numOfAllocates) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
