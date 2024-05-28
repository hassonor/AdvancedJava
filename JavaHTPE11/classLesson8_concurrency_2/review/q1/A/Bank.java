package JavaHTPE11.classLesson8_concurrency_2.review.q1.A;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Integer> free = new ArrayList<>();

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
                throw new RuntimeException(e);
            }
        }
        return free.remove(0);
    }

    public synchronized void release(int teller) {
        free.add(teller);
        notifyAll();
    }
}
