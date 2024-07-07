package JavaHTPE11.exam_practice.exams.b2020_99.Q4;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager(10, 3, 5000);
        Worker[] workers = new Worker[10];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(m, i);
        }

        for (int i = 0; i < workers.length; i++) {
            workers[i].start();
        }

    }

}