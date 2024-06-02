package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_8_testQuestion.b;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Integer> free = new ArrayList<Integer>();

    public Bank(int size) {
        for (int i = 0; i < size; i++) {
            free.add(i);
        }
    }

    public synchronized int service(int teller) {
        while (!free.contains(teller)) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int index = free.indexOf(teller);
        return free.remove(index);
    }

    public synchronized void release(int teller) {
        free.add(teller);
        notifyAll();
    }
}
