package JavaHTPE11.exam_practice.review.concurrency.T26;

public class ResourceManager {
    private final int max;
    private int active;

    public ResourceManager(int max) {
        this.max = max;
    }

    public synchronized void useResource(Notifyable user) {
        while (active >= max) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        active++;
        new Resource(this, user).start();
    }

    public synchronized void finished() {
        active--;
        notifyAll();
    }

}
