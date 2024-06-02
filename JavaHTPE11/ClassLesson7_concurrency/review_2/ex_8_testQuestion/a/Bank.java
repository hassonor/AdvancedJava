package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_8_testQuestion.a;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Integer> free = new ArrayList<Integer>();

    public Bank(int size) {
        for (int i = 0; i < size; i++) {
            free.add(i);
        }
    }

    public synchronized int service() {
        while (free.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return free.remove(0);
    }

    public synchronized void release(int teller) {
        free.add(teller);
        notifyAll();
    }
}
