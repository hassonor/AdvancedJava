package JavaHTPE11.exam_practice.exams.a2020_82.Q4.B;

public class WorkThread extends Thread {
    private int[] vec;
    private int id;
    private int result;
    private static int nextTurn = 0;

    private static final Object obj = new Object();


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
        result = process(vec, id);

        synchronized (obj) {
            while (id > nextTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("task" + id + " result=" + result);
            nextTurn++;
            notifyAll();
        }
    }
}

