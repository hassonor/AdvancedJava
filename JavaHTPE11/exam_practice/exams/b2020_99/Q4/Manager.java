package JavaHTPE11.exam_practice.exams.b2020_99.Q4;

public class Manager {
    private int onBreak;
    private long[] lastThreadBreak;
    private int max;
    private long x;

    public Manager(int size, int max, int x) {
        this.max = max;
        this.x = x;
        onBreak = 0;
        lastThreadBreak = new long[size]; // Correct initialization
    }

    public synchronized void permit(int id) {
        System.out.println("Worker " + id + " is requesting a break.");
        while (onBreak == max || (System.currentTimeMillis() - lastThreadBreak[id] < x)) {
            try {
                long waitTime = x - (System.currentTimeMillis() - lastThreadBreak[id]);
                if (onBreak == max) {
                    System.out.println("Worker " + id + " is waiting because max onBreak is reached.");
                    wait();
                } else if (waitTime > 0) {
                    System.out.println("Worker " + id + " is waiting for " + waitTime + "ms because of time constraint.");
                    wait(waitTime);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lastThreadBreak[id] = System.currentTimeMillis();
        onBreak++;
        System.out.println("Worker " + id + " is permitted to take a break. Current onBreak: " + onBreak);
    }

    public synchronized void back() {
        onBreak--;
        notifyAll();
        System.out.println("A worker is back from break. Current onBreak: " + onBreak);
    }
}