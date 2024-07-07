package JavaHTPE11.exam_practice.review.T1;


public class Manager {
    private int[][] mat;
    private int current;
    private int sum;
    private int done;

    public Manager(int[][] mat) {
        this.mat = mat;
    }

    public synchronized int[] allocateRow() {
        if (current == mat.length)
            return null;
        return mat[current++];
    }

    public synchronized void setSum(int sum) {
        this.sum += sum;
        done++;
        if (done == mat.length)
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
