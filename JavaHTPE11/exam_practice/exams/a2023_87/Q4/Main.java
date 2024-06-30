package JavaHTPE11.exam_practice.exams.a2023_87.Q4;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10;
        Random r = new Random();

        int[][] mat = new int[100][100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                mat[i][j] = r.nextInt(1000) + 1;
            }
        }

        Manager m = new Manager(mat);
        Worker[] workers = new Worker[SIZE];

        for (int i = 0; i < SIZE; i++) {
            workers[i] = new Worker(m);
        }

        for (int i = workers.length - 1; i >= 0; i--) {
            workers[i].start();
        }

        System.out.println("Sum: " + m.getTotal());

    }

}
