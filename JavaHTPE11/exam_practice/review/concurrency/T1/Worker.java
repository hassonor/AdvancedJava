package JavaHTPE11.exam_practice.review.T1;

public class Worker extends Thread {
    private Manager m;

    public Worker(Manager m) {
        this.m = m;
    }

    @Override
    public void run() {
        int[] row = m.allocateRow();
        while (row != null) {
            int sum = 0;
            for (int i = 0; i < row.length; i++) {
                sum += row[i];
            }
            m.setSum(sum);
            row = m.allocateRow();
        }
    }

}
