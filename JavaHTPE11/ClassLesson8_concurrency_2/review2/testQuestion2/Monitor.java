package JavaHTPE11.ClassLesson8_concurrency_2.review2.testQuestion2;

public class Monitor {
    private int turn = 1;

    int num;

    public Monitor(int num) {
        this.num = num;
    }


    public synchronized void waitForMyPrint(int num) {
        while (num >= turn) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void threadDone() {
        turn++;
        notifyAll();
    }

    public synchronized void waitForAllDone() {
        while (turn <= num) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
