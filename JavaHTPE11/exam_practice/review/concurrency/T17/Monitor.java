package JavaHTPE11.exam_practice.review.concurrency.T17;

public class Monitor {
    private int numOfThread, finished;

    public Monitor(int numOfThread) {
        this.numOfThread = numOfThread;
    }

    public synchronized void finished() {
        finished++;
        if (finished < numOfThread) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (finished == numOfThread) {
            finished = 0;
            notifyAll();
        }
    }
}
