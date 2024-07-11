package JavaHTPE11.exam_practice.review.concurrency.T19.B;

import java.util.*;

public class Bank {
    private ArrayList<Integer> freeTellers = new ArrayList<Integer>();

    public Bank(int size) {
        for (int i = 0; i < size; i++) {
            freeTellers.add(i);
        }
    }

    public synchronized int service(int teller) {
        while (!freeTellers.contains(teller)) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return freeTellers.remove(freeTellers.indexOf(teller));
    }

    public synchronized void release(int teller) {
        freeTellers.add(teller);
        notifyAll();
    }
}
