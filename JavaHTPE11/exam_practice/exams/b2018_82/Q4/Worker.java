package JavaHTPE11.exam_practice.exams.b2018_82.Q4;

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
                res[0] = res[0] * 2;
            } else {
                res[0] = res[0] / 2;
            }
            m.putResult(res[0], res[1]);
            res = m.allocateNum();
        }
    }

}
