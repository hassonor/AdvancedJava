package JavaHTPE11.classLesson8_concurrency_2.testQuestion5.solution_1;

public class Main {
    public static void main(String[] args) {
        final int MAX = 10;
        Work w = new Work();
        Worker[] a = new Worker[MAX];

        for (int i = 0; i < MAX; i++) {
            a[i] = new Worker(i, w);
        }

        for (int i = 0; i < MAX; i++) {
            a[i].start();
        }

        for (int i = 0; i < MAX; i++) {
            try {
                a[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("MAIN DONE");
    }
}
