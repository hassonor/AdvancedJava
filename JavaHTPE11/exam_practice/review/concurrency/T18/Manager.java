package JavaHTPE11.exam_practice.review.concurrency.T18;


public class Manager {
    private int max;
    private int onBreak;
    private long[] lastThreadBreak;
    private long x;

    public Manager(int size, int max, long x) {
        this.max = max;
        this.x = x;
        lastThreadBreak = new long[size];
    }

    public synchronized void permit(int id) {
        while (onBreak == max || System.currentTimeMillis() - lastThreadBreak[id] < x) {
            try {
                long waitTime = x - (System.currentTimeMillis() - lastThreadBreak[id]);
                if (onBreak == max) {
                    wait();
                } else if (waitTime > 0) {
                    wait(waitTime);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lastThreadBreak[id] = System.currentTimeMillis();
        onBreak++;
    }

    public synchronized void back() {
        onBreak--;
        notifyAll();
    }

}
