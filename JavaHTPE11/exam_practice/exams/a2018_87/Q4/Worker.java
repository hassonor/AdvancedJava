package JavaHTPE11.exam_practice.exams.a2018_87.Q4;

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
            m.sum(sum);
            row = m.allocateRow();

        }
    }

}
