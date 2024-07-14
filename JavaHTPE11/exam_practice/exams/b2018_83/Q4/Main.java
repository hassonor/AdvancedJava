package JavaHTPE11.exam_practice.exams.b2018_83.Q4;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager(10);
        Worker[] workers = new Worker[10];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(m, i + 1);
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
        System.out.println("All Workers Done!");
    }
}






