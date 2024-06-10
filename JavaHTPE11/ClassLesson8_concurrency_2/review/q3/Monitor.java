package JavaHTPE11.ClassLesson8_concurrency_2.review.q3;

public class Monitor {
    private int nextTurn = 1;

    private int size;

    public Monitor(int size) {
        this.size = size;
    }

    public synchronized void waitForMyTurn(int threadId) {
        while (threadId >= nextTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void donePrint() {
        nextTurn++;
        notifyAll();
    }

    public synchronized void allDone() {
        while (nextTurn <= size) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
