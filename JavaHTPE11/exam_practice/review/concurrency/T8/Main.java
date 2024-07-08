package JavaHTPE11.exam_practice.review.concurrency.T8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ComputeTask[] tasks = new ComputeTask[10];

        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new ComputeTask(createRandomArr());
        }

        for (int i = 0; i < tasks.length; i++) {
            tasks[i].start();
        }

        int totalSum = 0;
        for (int i = 0; i < tasks.length; i++) {
            totalSum += tasks[i].getSum();
        }

        System.out.println("Total Sum: " + totalSum);
    }

    private static int[] createRandomArr() {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }

        return arr;
    }

}
