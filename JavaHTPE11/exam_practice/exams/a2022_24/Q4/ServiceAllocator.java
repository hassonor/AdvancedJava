package JavaHTPE11.exam_practice.exams.a2022_24.Q4;


public class ServiceAllocator {
    private int free;
    private boolean[] services;

    public ServiceAllocator(int size) {
        free = size;
        services = new boolean[size];
    }

    public synchronized int allocate() {
        while (free == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }

        for (int i = 0; i < services.length; i++) {
            if (!services[i]) {
                services[i] = true;
                free--;
                return i;
            }
        }

        return -1;
    }

    public synchronized void release(int num) {
        services[num] = false;
        free++;
        notifyAll();
    }
}
