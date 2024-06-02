package JavaHTPE11.classLesson8_concurrency_2.review2.testQuestion3;

import java.util.Random;

public class Car extends Thread {
    private Garage g;

    public Car(Garage g) {
        this.g = g;
    }

    @Override
    public void run() {
        super.run();
        sleepRandom(10000);
        int num = g.park();
        sleepRandom(10000);
        g.release(num);
    }

    private void sleepRandom(int sleepMS) {
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(sleepMS));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
