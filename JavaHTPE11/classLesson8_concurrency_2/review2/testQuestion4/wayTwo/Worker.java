package JavaHTPE11.classLesson8_concurrency_2.review2.testQuestion4.wayTwo;

public class Worker extends Thread {
    private int id;
    private Work w;

    public Worker(int id, Work w) {
        this.id = id;
        this.w = w;
    }

    public void run() {
        w.stage1(id);
        w.stage2(id);
    }
}
