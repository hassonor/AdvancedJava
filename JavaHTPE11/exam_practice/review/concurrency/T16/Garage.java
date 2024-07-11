package JavaHTPE11.exam_practice.review.concurrency.T16;


public class Garage {
    private int free;
    private boolean[] parks;

    public Garage(int size) {
        free = size;
        parks = new boolean[size];
    }

    public synchronized int park() {
        while (free == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < parks.length; i++) {
            if (!parks[i]) {
                parks[i] = true;
                free--;
                return i;
            }
        }

        return -1;
    }

    public synchronized void release(int park) {
        parks[park] = false;
        free++;
        notifyAll();
    }
}

