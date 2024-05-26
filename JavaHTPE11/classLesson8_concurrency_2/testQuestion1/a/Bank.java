package JavaHTPE11.classLesson8_concurrency_2.testQuestion1.a;

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
            } catch (InterruptedException exception) {
                System.err.println(exception.getMessage());
            }
        }
        return free.remove(0);
    }

    public synchronized void release(int teller) {
        free.add(teller);
        notifyAll();
    }
}
