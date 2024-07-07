package JavaHTPE11.exam_practice.review.concurrency.T4;

import java.util.Random;

public class Worker extends Thread {
    private ConStack<Integer> st;
    private int num;

    private int sum;

    private int count;

    public Worker(ConStack<Integer> st, int num) {
        this.st = st;
        this.num = num;
    }

    @Override
    public void run() {
        Random r = new Random();
        synchronized (this) {
            while (count != num) {
                st.push(num);
                Integer i = st.pop();
                sum += i;
                count++;
                if (count == num) {
                    notifyAll();
                    break;
                }
                try {
                    Thread.sleep(r.nextInt(1001));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public synchronized int getTotal() {
        while (count != num) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return sum;

    }
}
