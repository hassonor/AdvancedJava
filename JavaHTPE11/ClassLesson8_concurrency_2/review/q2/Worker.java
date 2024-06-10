package JavaHTPE11.ClassLesson8_concurrency_2.review.q2;

public class Worker extends Thread {

    private Manager m;

    public Worker(Manager m) {
        this.m = m;
    }


    @Override
    public void run() {
        super.run();
        int[] row = m.allocateRow();
        while (row != null) {
            int sum = 0;
            for (int i = 0; i < row.length; i++) {
                sum += row[i];
            }
            m.addRow(sum);
            row = m.allocateRow();
        }
    }
}
