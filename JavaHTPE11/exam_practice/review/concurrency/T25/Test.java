package JavaHTPE11.exam_practice.review.concurrency.T25;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        final int SIZE = 100;
        Random r = new Random();
        int[] mat = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            mat[i] = r.nextInt(1000) + 1;
        }

        Manager m = new Manager(mat);
        Worker[] workers = new Worker[10];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(m);
        }
        for (int i = 0; i < workers.length; i++) {
            workers[i].start();
        }

        System.out.println("Results: " + Arrays.toString(m.getResults()));
    }

}
