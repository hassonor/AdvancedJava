package JavaHTPE11.exam_practice.review.concurrency.T10;

public class MaxTask extends Thread {
    private int[] arr;
    private int max;
    private int first, last;
    private Monitor m;

    public MaxTask(int[] arr, int first, int last, Monitor m) {
        this.arr = arr;
        this.first = first;
        this.last = last;
        this.m = m;
    }

    public int getMax() {
        return max;
    }

    public void run() {
        max = arr[first];
        for (int i = first + 1; i <= last; i++) {
            if (arr[i] > max) max = arr[i];
        }
        m.iAmDone();

    }

}
