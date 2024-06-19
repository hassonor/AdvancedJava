package JavaHTPE11.ClassLesson11_test_questions.testQuestion3_concurrency.a_way1;

public class ResourceAllocator {

    private int free;
    private boolean[] resources;

    public ResourceAllocator(int size) {
        this.free = size;
        resources = new boolean[size + 1];
    }

    public synchronized int allocateResource() {
        while (free == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i < resources.length; i++) {
            if (!resources[i]) {
                resources[i] = true;
                free--;
                return i;
            }
        }
        return -1;
    }

    public synchronized void release(int n) {
        free++;
        resources[n] = false;
        notifyAll();
    }
}
