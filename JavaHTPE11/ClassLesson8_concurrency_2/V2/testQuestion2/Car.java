package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion2;

public class Car extends Thread {
    Park park;

    public Car(Park park) {
        super();
        this.park = park;
    }

    public void run() {
        park.enter();

        try {
            sleep((int) (Math.random() * 10000));
        } catch (InterruptedException e) {
        }

        park.exit();
    }
}