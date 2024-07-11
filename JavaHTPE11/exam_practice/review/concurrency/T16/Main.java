package JavaHTPE11.exam_practice.review.concurrency.T16;

public class Main {
    public static void main(String[] args) {
        Garage g = new Garage(30);
        Car[] cars = new Car[100];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(g);
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
        }
    }

}
