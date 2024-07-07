package JavaHTPE11.exam_practice.review.concurrency.T4;

import java.util.ArrayList;

public class ConStack<T> {
    private ArrayList<T> arr;
    private int maxSize;

    public ConStack(int max) {
        maxSize = max;
        arr = new ArrayList<T>();
    }

    public synchronized void push(T item) {
        while (arr.size() == maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        arr.add(item);
        notifyAll();
    }

    public synchronized T pop() {
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T item = arr.remove(arr.size() - 1);
        notifyAll();
        return item;
    }

    public synchronized boolean isEmpty() {
        return arr.isEmpty();
    }

}
