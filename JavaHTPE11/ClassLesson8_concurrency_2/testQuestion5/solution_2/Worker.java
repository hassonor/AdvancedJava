package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion5.solution_2;


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
