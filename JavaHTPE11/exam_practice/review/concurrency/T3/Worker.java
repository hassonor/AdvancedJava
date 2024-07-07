package JavaHTPE11.exam_practice.review.concurrency.T3;

import JavaHTPE11.exam_practice.exams.b2022_82.Q4.Resources;

public class Worker extends Thread {
    private Monitor m;
    private Resources[] resources;
    private boolean flag = true;

    public Worker(Monitor m, Resources[] resources) {
        this.m = m;
        this.resources = resources;
    }


    @Override
    public void run() {
        while (flag) {
            int num = m.allocate();
            int sum = resources[num].calculate();
            m.free(num);
            System.out.println(sum);
        }
    }

    public void finish() {
        flag = false;
    }

}
