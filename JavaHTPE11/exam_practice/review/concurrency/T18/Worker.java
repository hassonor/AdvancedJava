package JavaHTPE11.exam_practice.review.concurrency.T18;

import java.util.Random;

public class Worker extends Thread {
    private Manager m;
    private int id;

    public Worker(int id, Manager m) {
        this.m = m;
        this.id = id;
    }

    @Override
    public void run() {
        randomTime();
        m.permit(id);
        randomTime();
        m.back();

    }

    private void randomTime() {
        Random r = new Random();
        try {
            sleep(r.nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
