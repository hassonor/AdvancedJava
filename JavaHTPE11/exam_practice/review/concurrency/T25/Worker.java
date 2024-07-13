package JavaHTPE11.exam_practice.review.concurrency.T25;

public class Worker extends Thread {
    private Manager m;

    public Worker(Manager m) {
        this.m = m;
    }

    @Override
    public void run() {
        int[] res = m.allocateNum();
        while (res != null) {
            if (res[1] % 2 == 0) {
                res[0] *= 2;
            } else {
                res[0] /= 2;
            }
            m.putResult(res);
            res = m.allocateNum();
        }
    }

}
