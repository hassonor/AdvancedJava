package JavaHTPE11.exam_practice.exams.b2018_82.Q4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = r.nextInt(1000) + 1;
        }
        Manager m = new Manager(arr);
        Worker[] workers = new Worker[10];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(m);
        }

        for (int i = 0; i < workers.length; i++) {
            workers[i].start();
        }

        System.out.println("Array after calculation: " + Arrays.toString(m.getResults()));

    }

}
