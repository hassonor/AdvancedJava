package JavaHTPE11.exam_practice.exams.a2019_86.Q4.B;

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
        int index = freeTellers.indexOf(teller);
        freeTellers.remove(index);
        return teller;
    }

    public synchronized void release(int teller) {
        freeTellers.add(teller);
        notifyAll();
    }
}
