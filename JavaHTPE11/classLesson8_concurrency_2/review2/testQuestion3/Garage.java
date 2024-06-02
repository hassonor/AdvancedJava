package JavaHTPE11.classLesson8_concurrency_2.review2.testQuestion3;

public class Garage {

    private boolean[] freeParks;
    private int free = 0;

    public Garage(int size) {
        this.free = size;
        freeParks = new boolean[size];
    }

    public synchronized int park() {
        while (free == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < freeParks.length; i++) {
            if (!freeParks[i]) {
                free--;
                freeParks[i] = true;
                return i;
            }
        }
        return -1;
    }

    public synchronized void release(int num) {
        free++;
        freeParks[num] = false;
        notifyAll();
    }

}
