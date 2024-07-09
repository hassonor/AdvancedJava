package JavaHTPE11.exam_practice.exams.a2018_87.Q4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int SIZE = 100;
        int[][] mat = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                mat[i][j] = r.nextInt(1000) + 1;
            }
        }

        Manager m = new Manager(mat);
        Worker[] workers = new Worker[10];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(m);
        }

        for (int i = 0; i < workers.length; i++) {
            workers[i].start();
        }

        System.out.println("Total sum: " + m.getTotal());
    }
}
