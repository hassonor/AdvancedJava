package JavaHTPE11.ClassLesson7_concurrency.ex9_wait_notifyAll;

public class MyMonitor {
    private int nextTurn = 2;

    public synchronized void waitForMyTurn(int threadNumber) {
        while (threadNumber >= nextTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }


    public synchronized void imDone() {
        nextTurn++;
        notifyAll();
    }
}
