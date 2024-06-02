package JavaHTPE11.classLesson8_concurrency_2.review2.testQuestion1;

public class Manager {

    private int[][] mat;
    private int sum = 0;

    private int current = 0;

    private int done = 0;

    public Manager(int[][] mat) {
        this.mat = mat;
    }

    public synchronized int[] allocateRow() {
        if (current < mat.length) {
            return mat[current++];
        }
        return null;
    }

    public synchronized void addSum(int sum) {
        this.sum += sum;
        done++;
        notifyAll();
    }

    public synchronized int getTotal() {
        while (done != mat.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return sum;
    }
}
