package JavaHTPE11.exam_practice.exams.a2021_74.Q4;

public class MaxTask extends Thread {
    private int[] arr;
    private int max;
    private int first, last;

    private Monitor m;

    public MaxTask(Monitor m, int[] arr, int first, int last) {
        this.m = m;
        this.arr = arr;
        this.first = first;
        this.last = last;
    }

    public int getMax() {
        return max;
    }

    public void run() {
        max = arr[first];
        for (int i = first + 1; i <= last; i++) {
            if (arr[i] > max) max = arr[i];
        }
        m.workerDone();
    }
}
