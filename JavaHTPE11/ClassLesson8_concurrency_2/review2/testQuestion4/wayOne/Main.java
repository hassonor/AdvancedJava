package JavaHTPE11.ClassLesson8_concurrency_2.review2.testQuestion4.wayOne;

public class Main {
    public static void main(String[] args) {
        Work w = new Work();
        Worker[] workers = new Worker[10];

        for (int i = 0; i < 10; i++) {
            workers[i] = new Worker(i, w);
        }

        for (int i = workers.length - 1; i >= 0; i--) {
            workers[i].start();
        }

        for (int i = 0; i < workers.length; i++) {
            try {
                workers[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("MAIN DONE");


    }
}
