package JavaHTPE11.exam_practice.exams.b2021_22.Q4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ComputeTask[] ct = new ComputeTask[10];

        for (int i = 0; i < ct.length; i++) {
            ct[i] = new ComputeTask(createRandomArray());
        }

        for (int i = 0; i < ct.length; i++) {
            ct[i].start();
        }

        int totalSum = 0;

        for (int i = 0; i < ct.length; i++) {
            totalSum += ct[i].getSum();
        }

        System.out.println("Total Sum: " + totalSum);


    }

    private static int[] createRandomArray() {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(101);
        }
        return arr;
    }
}
