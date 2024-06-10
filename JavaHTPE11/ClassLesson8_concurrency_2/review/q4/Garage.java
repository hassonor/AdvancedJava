package JavaHTPE11.ClassLesson8_concurrency_2.review.q4;

public class Garage {

    private int parks;
    private boolean[] places;

    public Garage(int size) {
        this.parks = size;
        places = new boolean[size];
    }

    public synchronized int park() {
        while (parks == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < places.length; i++) {
            if (!places[i]) {
                places[i] = true;
                parks--;
                return i;
            }
        }
        return -1;
    }

    public synchronized void release(int freePark) {
        places[freePark] = false;
        parks++;
        notifyAll();
    }
}
