package JavaHTPE11.ClassLesson8_concurrency_2.review.q2;

public class Manager {
    public int[][] mat;
    public int sum = 0;
    public int current = 0;
    public int done = 0;

    public Manager(int[][] mat) {
        this.mat = mat;
    }

    public synchronized int[] allocateRow() {
        if (current < mat.length) {
            return mat[current++];
        } else {
            return null;
        }
    }

    public synchronized void addRow(int sumRow) {
        sum += sumRow;
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
