package JavaHTPE11.exam_practice.review.concurrency.T1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] mat = new int[100][100];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = r.nextInt(1000) + 1;
            }
        }

        Manager m = new Manager(mat);
        Worker[] workers = new Worker[10];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(m);
        }

        for (int i = workers.length - 1; i >= 0; i--) {
            workers[i].start();
        }

        System.out.println("Matrix Sum: " + m.getTotal());
    }

}
