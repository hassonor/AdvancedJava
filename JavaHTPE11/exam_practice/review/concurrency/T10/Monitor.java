package JavaHTPE11.exam_practice.review.concurrency.T10;

public class Monitor {
    private int done;
    private int size;

    public Monitor(int size) {
        this.size = size;
    }


    public synchronized void iAmDone() {
        done++;
        if (done == size)
            notifyAll();
    }

    public synchronized void allDone() {
        while (done != size) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
