package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion2;

public class Worker extends Thread {

    private Manager m;

    public Worker(Manager m) {
        this.m = m;
    }


    @Override
    public void run() {
        super.run();
        int[] a = m.allocateRow();
        while (a != null) {
            int sumOfRow = 0;
            for (int item : a) {
                sumOfRow += item;
            }
            m.addSum(sumOfRow);
            a = m.allocateRow();
        }
        m.getTotal();

    }
}
