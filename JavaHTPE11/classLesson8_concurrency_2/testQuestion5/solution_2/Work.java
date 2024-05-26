package JavaHTPE11.classLesson8_concurrency_2.testQuestion5.solution_2;

public class Work {
    private final int MAX = 10;

    private int done = 0;

    public void stage1(int id) {
        System.out.println("worker " + id + " finished stage 1");
        synchronized (this) {
            done++;
            notifyAll();
        }
    }

    public void stage2(int id) {
        synchronized (this) {
            while (done != MAX) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("worker " + id + " finished stage 2");
    }
}
