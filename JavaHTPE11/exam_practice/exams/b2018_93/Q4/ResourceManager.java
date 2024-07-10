package JavaHTPE11.exam_practice.exams.b2018_93.Q4;

public class ResourceManager {
    private final int maxResources;
    private int activeResources = 0;

    public ResourceManager(int maxResources) {
        this.maxResources = maxResources;
    }

    public synchronized void useResource(Notifyable user) {
        while (activeResources >= maxResources) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        activeResources++;
        new Resource(this, user).start();
    }

    public synchronized void finished() {
        activeResources--;
        notifyAll(); //
    }
}

