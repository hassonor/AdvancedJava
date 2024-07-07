package JavaHTPE11.exam_practice.review.concurrency.T6;

public class ServiceAllocator {

    private int free;
    private boolean[] services;

    public ServiceAllocator(int n) {
        free = n;
        services = new boolean[n + 1];
    }

    public synchronized int allocate() {
        while (free == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i < services.length; i++) {
            if (!services[i]) {
                services[i] = true;
                free--;
                return i;
            }
        }
        return -1;
    }

    public synchronized void release(int index) {
        services[index] = false;
        free++;
        notifyAll();
    }


}