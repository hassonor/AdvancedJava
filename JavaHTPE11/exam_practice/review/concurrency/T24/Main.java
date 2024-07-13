package JavaHTPE11.exam_practice.review.concurrency.T24;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] mat = new int[100][100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
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

        System.out.println("Total Sum: " + m.getTotal());

    }
}
