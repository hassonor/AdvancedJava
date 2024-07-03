package JavaHTPE11.exam_practice.exams.a2021_74.Q4;

public class MainTask {
    public static void main(String[] args) throws Exception {
        int size = 100;
        int workers = 10;
        int[] arr = new int[size];
        int max = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (max < arr[i]) max = arr[i];
        }

        System.out.println("max=" + max);
        int gsize = (arr.length - 1) / workers;
        MaxTask[] tasks = new MaxTask[workers];
        Monitor m = new Monitor(workers);
        int first = 0;
        int last;
        for (int i = 0; i < workers; i++) {
            last = (i == workers - 1) ? size - 1 : first + gsize - 1;
            tasks[i] = new MaxTask(m, arr, first, last);
            tasks[i].start();
        }

        m.waitForAllWorkers();

        int maxmax = tasks[0].getMax();
        int temp;
        for (int i = 1; i < workers; i++) {
            temp = tasks[i].getMax();
            if (temp > maxmax) maxmax = temp;
        }

        System.out.println("maxmax=" + maxmax);
    }
}
