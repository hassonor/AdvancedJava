package JavaHTPE11.ClassLesson8_concurrency_2.review.q4;

import java.util.Random;

public class Car extends Thread {
    Garage g;

    public Car(Garage g) {
        this.g = g;
    }


    @Override
    public void run() {
        super.run();
        waitForRandomTime();
        int numOfPark = g.park();
        waitForRandomTime();
        g.release(numOfPark);
    }

    public void waitForRandomTime() {
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(10000));
            int numOfPark = g.park();
            Thread.sleep(r.nextInt(10000));
            g.release(numOfPark);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
