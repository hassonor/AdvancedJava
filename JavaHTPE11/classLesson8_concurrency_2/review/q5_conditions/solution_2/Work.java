package JavaHTPE11.classLesson8_concurrency_2.review.q5_conditions.solution_2;


public class Work {

    private int size;

    private int current;

    public Work(int size) {
        this.size = size;
        current = 0;
    }

    public void stage1(int id) {
        System.out.println("worker " + id + " finished stage 1");
        synchronized (this) {
            current++;
            notifyAll();
        }
    }

    public void stage2(int id) {
        synchronized (this) {
            while (current != size) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("worker " + id + " finished stage 2");
    }
}
