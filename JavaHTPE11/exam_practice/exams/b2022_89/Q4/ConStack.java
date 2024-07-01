package JavaHTPE11.exam_practice.exams.b2022_89.Q4;

import java.util.ArrayList;

public class ConStack<T> {
    private ArrayList<T> arr;
    private int size;

    public ConStack(int size) {
        this.size = size;
        arr = new ArrayList<T>();
    }

    public synchronized void push(T item) {
        while (arr.size() == size) {
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
        T item = arr.get(arr.size() - 1);
        notifyAll();
        return item;
    }

    public synchronized boolean isEmpty() {
        return arr.isEmpty();
    }
}
