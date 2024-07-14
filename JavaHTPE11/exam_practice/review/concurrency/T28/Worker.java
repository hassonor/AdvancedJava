package JavaHTPE11.exam_practice.review.concurrency.T28;

public class Worker extends Thread {
    private int id;
    private Work work;

    public Worker(int id, Work work) {
        this.id = id;
        this.work = work;
    }

    public void run() {
        work.stage1(id);
        work.stage2(id);
    }

}
