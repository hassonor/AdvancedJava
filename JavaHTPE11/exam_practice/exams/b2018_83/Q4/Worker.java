package JavaHTPE11.exam_practice.exams.b2018_83.Q4;

public class Worker extends Thread {
    private Manager m;
    private int id;

    public Worker(Manager m, int id) {
        this.m = m;
        this.id = id;
    }

    @Override
    public void run() {
        m.stage1(id);
        m.stage2(id);
    }

}

