package JavaHTPE11.exam_practice.review.concurrency.T19.A;

import java.util.*;

public class Bank {
    private ArrayList<Integer> freeTellers = new ArrayList<Integer>();

    public Bank(int size) {
        for (int i = 0; i < size; i++) {
            freeTellers.add(i);
        }
    }

    public synchronized int service() {
        int teller;
        while (freeTellers.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        teller = freeTellers.get(0);
        freeTellers.remove(0);
        return teller;
    }

    public synchronized void release(int teller) {
        freeTellers.add(teller);
        notifyAll();
    }
}
