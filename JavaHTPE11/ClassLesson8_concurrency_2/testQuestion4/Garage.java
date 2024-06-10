package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion4;

public class Garage {
    private int empty;
    private boolean[] places;


    public Garage(int size) {
        empty = size;
        places = new boolean[size];
    }

    public synchronized int park() {
        while (empty == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < places.length; i++) {
            if (!places[i]) {
                empty--;
                places[i] = true;
                return i;
            }
        }

        return -1;
    }

    public synchronized void release(int num) {
        places[num] = false;
        empty++;
        notifyAll();
    }
}
