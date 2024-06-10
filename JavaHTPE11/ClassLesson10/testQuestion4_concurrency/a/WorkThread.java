package JavaHTPE11.ClassLesson10.testQuestion4_concurrency.a;

public class WorkThread extends Thread {
    private int[] vec;
    private int id;
    private int result;

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
        super.run();
        result = process(vec, id);
        System.out.println("task " + id + ",result=" + result);
    }
}
