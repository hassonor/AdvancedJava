package JavaHTPE11.exam_practice.exams.a2023_87.Q4;

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
            m.setSum(sum);
            row = m.allocateRow();
        }
    }

}
