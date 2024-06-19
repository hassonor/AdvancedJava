package JavaHTPE11.ClassLesson11_test_questions.testQuestion3_concurrency.b;

import java.util.ArrayList;

public class ResourceAllocator {

    private ArrayList<Integer> arr;

    public ResourceAllocator(int size) {
        arr = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            arr.add(i);
        }
    }

    public synchronized int allocateResource() {
        while (arr.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return arr.remove(0);
    }

    public synchronized void release(Integer n) {
        arr.add(n);
        notifyAll();
    }
}
