package JavaHTPE11.exam_practice.exams.b2020_73.Q4;

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

    public synchronized void release(int num) {
        parks[num] = false;
        free++;
        notifyAll();
    }

}
