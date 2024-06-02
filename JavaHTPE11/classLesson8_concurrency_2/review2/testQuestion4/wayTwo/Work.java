package JavaHTPE11.classLesson8_concurrency_2.review2.testQuestion4.wayTwo;

public class Work {

    private final int MAX = 10;

    private int done = 0;

    public void stage1(int id) {
        System.out.println("Worker " + id + " finished stage 1");
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
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Worker " + id + " finished stage 2");
        }
    }
}
