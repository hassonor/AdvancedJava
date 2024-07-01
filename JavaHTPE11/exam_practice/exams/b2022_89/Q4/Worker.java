package JavaHTPE11.exam_practice.exams.b2022_89.Q4;

import java.util.Random;

public class Worker extends Thread {
    private ConStack<Integer> st;
    private final int num;
    private int count;
    private int sum;

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
                int value = st.pop();
                sum += value;
                count++;
                if (count == num) {
                    notifyAll();
                    break;
                }

                try {
                    sleep(r.nextInt(1001));
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
