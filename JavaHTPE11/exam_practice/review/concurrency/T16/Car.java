package JavaHTPE11.exam_practice.review.concurrency.T16;

import java.util.Random;

public class Car extends Thread {
    private Garage g;

    public Car(Garage g) {
        this.g = g;
    }

    @Override
    public void run() {
        randomSleep();
        int num = g.park();
        randomSleep();
        g.release(num);
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
