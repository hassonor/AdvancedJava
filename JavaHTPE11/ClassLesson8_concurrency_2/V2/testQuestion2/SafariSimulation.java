package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion2;

public class SafariSimulation {
    public static void main(String[] args) {
        Park park = new Park(100);
        for (int i = 0; i < 1000; i++) {
            new Car(park).start();
            System.out.println("car started");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
