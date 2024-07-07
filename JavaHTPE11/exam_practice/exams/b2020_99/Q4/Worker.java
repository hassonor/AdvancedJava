package JavaHTPE11.exam_practice.exams.b2020_99.Q4;

import java.util.Random;

public class Worker extends Thread {
    private Manager m;
    private int id;

    public Worker(Manager m, int id) {
        this.m = m;
        this.id = id;
    }

    @Override
    public void run() {
        randomSleep();
        m.permit(id);
        randomSleep();
        m.back();
    }

    private void randomSleep() {
        Random r = new Random();
        try {
            sleep(r.nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
