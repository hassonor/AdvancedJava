package JavaHTPE11.classLesson8_concurrency_2.review.q5_conditions.solution_1;

public class Worker extends Thread {
    private int d;
    private Work w;

    public Worker(int d, Work w) {
        this.d = d;
        this.w = w;
    }

    @Override
    public void run() {
        super.run();
        w.stage1(d);
        w.stage2(d);
    }
}
