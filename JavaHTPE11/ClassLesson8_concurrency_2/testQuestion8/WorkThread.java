package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion8;

public class WorkThread extends Thread {
    private int[] vec;
    private int id;
    private int result;

    private static int nextTurn = 0;

    private static final Object monitor = new Object();

    public WorkThread(int[] vec, int id) {
        this.vec = vec;
        this.id = id;
    }

    public static synchronized int process(int[] vec, int id) {

        int result = 0;
        System.out.println("task" + id);
        for (int i = 0; i < vec.length; i++) {
            vec[i] = vec[i] + 1;
            result = result + vec[i];
        }
        return result;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            while (id != nextTurn) {
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            result = process(vec, id);
            System.out.println("task " + id + ", result=" + result);
            nextTurn++;
            monitor.notifyAll();
        }
    }

}
