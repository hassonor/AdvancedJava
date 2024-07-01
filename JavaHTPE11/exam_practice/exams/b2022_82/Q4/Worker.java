package JavaHTPE11.exam_practice.exams.b2022_82.Q4;


public class Worker extends Thread {
    private Manager m;
    private boolean isStopped = false;
    private Resources[] r;

    public Worker(Manager m, Resources[] r) {
        this.m = m;
        this.r = r;
    }

    @Override
    public void run() {
        while (!isStopped) {
            int index = m.allocate();
            int result = r[index].calculate();
            m.free(index);
            System.out.println("Result: " + result);
        }
    }

    public void finish() {
        isStopped = true;
    }

}
