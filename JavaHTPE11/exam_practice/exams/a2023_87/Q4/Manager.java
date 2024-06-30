package JavaHTPE11.exam_practice.exams.a2023_87.Q4;

public class Manager {
    private int[][] mat;
    private int currentRow;
    private int sum;
    private int done;

    public Manager(int[][] mat) {
        this.mat = mat;
    }

    public synchronized int[] allocateRow() {
        if (currentRow == mat.length)
            return null;
        return mat[currentRow++];
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
