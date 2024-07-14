package JavaHTPE11.exam_practice.review.concurrency.T26;

public class Resource extends Thread {
    private Notifyable user;
    private ResourceManager rm;

    public Resource(ResourceManager rm, Notifyable user) {
        this.user = user;
        this.rm = rm;
    }

    public void run() {
        int result = (int) (Math.random() * 100);
        user.notify(result);
        rm.finished();
    }
}
