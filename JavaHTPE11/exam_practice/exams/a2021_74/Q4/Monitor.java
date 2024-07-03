package JavaHTPE11.exam_practice.exams.a2021_74.Q4;

public class Monitor {
    private int count = 0;
    private int totalWorkers;

    public Monitor(int totalWorkers) {
        this.totalWorkers = totalWorkers;
    }

    public synchronized void workerDone() {
        count++;
        notifyAll();
    }
    
    public synchronized void waitForAllWorkers() {
        while (count < totalWorkers) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}