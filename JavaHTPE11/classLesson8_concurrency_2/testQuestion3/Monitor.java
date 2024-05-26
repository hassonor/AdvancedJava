package JavaHTPE11.classLesson8_concurrency_2.testQuestion3;

public class Monitor {
    private int nextTurn = 1;

    private int size;

    public Monitor(int size) {
        this.size = size;
    }

    public synchronized void waitForPrint(int num) {
        while (num >= nextTurn) {
            try {
                wait();
            } catch (InterruptedException exception) {
                System.err.println(exception.getMessage());
            }
        }
    }

    public synchronized void donePrint() {
        nextTurn++;
        notifyAll();
    }

    public synchronized void waitForAll() {
        while (nextTurn <= size) {
            try {
                wait();
            } catch (InterruptedException exception) {
                System.err.println(exception.getMessage());
            }
        }
    }

}
