package JavaHTPE11.exam_practice.review.concurrency.T17;

public class WorkThread extends Thread {
    private int[] data;
    private int id;
    private int result;

    private Monitor m;

    public WorkThread(int[] data, int id, Monitor m) {
        this.data = data;
        this.id = id;
        this.m = m;
    }

    public int process(int[] data) {
        return 1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            result = process(data);
            System.out.println(result);
            m.finished();
        }
    }

}
