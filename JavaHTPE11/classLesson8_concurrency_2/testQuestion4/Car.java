package JavaHTPE11.classLesson8_concurrency_2.testQuestion4;

import java.util.Random;

public class Car extends Thread {

    private final int TIME = 10 * 1000;
    private Garage g;

    public Car(Garage g) {
        this.g = g;
    }

    @Override
    public void run() {
        super.run();
        waitRandomTime();
        int place = g.park();
        waitRandomTime();
        g.release(place);
    }

    public void waitRandomTime() {
        Random r = new Random();
        try {
            sleep(r.nextInt(TIME));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
