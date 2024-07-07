package JavaHTPE11.exam_practice.exams.b2020_76.Q4;

public class Monitor {
    private int numOfThreads;
    private int finished;

    public Monitor(int numOfThreads) {
        this.numOfThreads = numOfThreads;
    }

    public synchronized void finishIteration() {
        finished++;
        if (finished < numOfThreads) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (finished == numOfThreads) {
            finished = 0;
            notifyAll();
        }
    }

}
