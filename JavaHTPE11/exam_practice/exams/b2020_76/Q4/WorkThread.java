package JavaHTPE11.exam_practice.exams.b2020_76.Q4;

public class WorkThread extends Thread {
    private Monitor m;
    private int[] data;
    private int id;
    private int result;

    public WorkThread(int[] adata, int id, Monitor m) {
        this.data = data;
        this.id = id;
        this.m = m;
    }

    public int process(int[] data) {
        return -1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            result = process(data);
            System.out.println(result);
            m.finishIteration();
        }
    }
}
