package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_7_wait_and_notify;

public class Monitor {
    private int size = 10;

    private int nextTurn = 2;


    public synchronized void waitForMyTurn(int num) {
        while (num >= nextTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void imDone() {
        nextTurn++;
        notifyAll();
    }

    public synchronized void allDone() {
        while (nextTurn <= size) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
