package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion2;

public class Park {
    private int numberOfCars = 0;
    private int maxNumberOfCars = 0;

    public Park(int maxNumberOfCars) {
        this.maxNumberOfCars = maxNumberOfCars;
    }

    public synchronized void enter() {
        while (numberOfCars == maxNumberOfCars) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        numberOfCars++;
    }

    public synchronized void exit() {
        if (numberOfCars == maxNumberOfCars)
            notify();

        if (numberOfCars > 0)
            numberOfCars--;
    }
}