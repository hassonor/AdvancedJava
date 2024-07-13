package JavaHTPE11.exam_practice.review.concurrency.T25;

public class Manager {
    private int[] mat;
    private int current;
    private int done;

    public Manager(int[] mat) {
        this.mat = mat;
    }

    public synchronized int[] allocateNum() {
        if (current == mat.length)
            return null;

        int[] res = new int[]{mat[current], current};
        current++;
        return res;
    }

    public synchronized void putResult(int[] res) {
        mat[res[1]] = res[0];
        done++;
        if (done == mat.length)
            notifyAll();
    }

    public synchronized int[] getResults() {
        while (done != mat.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return mat;
    }


}
