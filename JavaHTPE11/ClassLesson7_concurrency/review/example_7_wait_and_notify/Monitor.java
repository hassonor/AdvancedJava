package JavaHTPE11.ClassLesson7_concurrency.review.example_7_wait_and_notify;

public class Monitor {
    private int numOfNext = 2;


    public synchronized void waitForMyTurn(int n) {
        while (n >= numOfNext) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void iAmDone() {
        numOfNext++;
        notifyAll();
    }
}
