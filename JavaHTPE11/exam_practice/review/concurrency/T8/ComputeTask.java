package JavaHTPE11.exam_practice.review.concurrency.T8;

public class ComputeTask extends Thread {
    private int[] arr;
    private int sum;
    private boolean isDone = false;

    public ComputeTask(int[] arr) {
        this.arr = arr;
    }

    public synchronized void sum() {
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        isDone = true;
        notifyAll();
    }

    @Override
    public void run() {
        sum();
    }

    public synchronized int getSum() {
        while (!isDone) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return sum;
    }

}
