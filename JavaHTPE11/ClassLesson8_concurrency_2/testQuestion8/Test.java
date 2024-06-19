package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion8;

public class Test {
    public static void main(String[] args) {
        int[] vec = {1, 2, 3, 4};
        WorkThread[] workers = new WorkThread[3];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new WorkThread(vec, i);
        }

        for (int i = 0; i < workers.length; i++) {
            workers[i].start();
        }

        for (int i = 0; i < workers.length; i++) {
            try {
                workers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("**main**");
    }
}
