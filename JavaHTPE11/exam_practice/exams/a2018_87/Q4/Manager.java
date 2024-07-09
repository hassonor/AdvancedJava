package JavaHTPE11.exam_practice.exams.a2018_87.Q4;

public class Manager {
    private int[][] mat;
    private int current;
    private int done;
    private int sum;

    public Manager(int[][] mat) {
        this.mat = mat;
    }

    public synchronized int[] allocateRow() {
        if (current == mat.length)
            return null;

        return mat[current++];
    }

    public synchronized void sum(int sum) {
        this.sum += sum;
        done++;
        notifyAll();
    }

    public synchronized int getTotal() {
        while (done != mat.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }

}
