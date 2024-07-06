package JavaHTPE11.exam_practice.exams.b2020_73.Q4;


import java.util.Random;

public class Car extends Thread {
    private Garage g;
    private final int RANDOM_TIME = 10000;

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
            sleep(r.nextInt(RANDOM_TIME));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
