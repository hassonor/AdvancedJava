package JavaHTPE11.classLesson8_concurrency_2.review.q1.B;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Integer> free = new ArrayList<>();

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
                throw new RuntimeException(e);
            }
        }
        return free.remove(free.indexOf(teller));
    }

    public synchronized void release(int teller) {
        free.add(teller);
        notifyAll();
    }
}
