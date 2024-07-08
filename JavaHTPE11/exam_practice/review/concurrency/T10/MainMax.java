package JavaHTPE11.exam_practice.review.concurrency.T10;

public class MainMax {
    public static void main(String[] args) throws Exception {
        int size = 100;
        int workers = 10;
        int[] arr = new int[size];
        int max = 0;
        Monitor m = new Monitor(10);

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
            if (max < arr[i]) max = arr[i];
        }

        System.out.println("max=" + max);
        int gsize = (arr.length - 1) / workers;
        MaxTask[] tasks = new MaxTask[workers];
        int first = 0;
        int last;
        for (int i = 0; i < workers; i++) {
            last = first + gsize;
            tasks[i] = new MaxTask(arr, first, last, m);
            tasks[i].start();
            first = last + 1;
        }

        m.allDone();

        int maxmax = tasks[0].getMax();
        int temp;
        for (int i = 1; i < workers; i++) {
            temp = tasks[i].getMax();
            if (temp > maxmax) maxmax = temp;
        }
        m.allDone();
        System.out.println("maxmax=" + maxmax);


    }

}
