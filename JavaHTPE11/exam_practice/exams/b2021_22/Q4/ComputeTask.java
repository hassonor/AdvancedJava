package JavaHTPE11.exam_practice.exams.b2021_22.Q4;

public class ComputeTask extends Thread {
    private int[] arr;
    private boolean isFinished = false;
    private int sum;


    public ComputeTask(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        sum();
    }

    public synchronized void sum() {
        int localSum = 0;
        for (int i = 0; i < arr.length; i++) {
            localSum += arr[i];
        }
        this.sum = localSum;
        isFinished = true;
        notifyAll();
    }

    public synchronized int getSum() {
        while (!isFinished) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return sum;
    }

}
