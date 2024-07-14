package JavaHTPE11.exam_practice.review.concurrency.T26;

public class User extends Thread implements Notifyable {
    private ResourceManager rm;
    private int sum;

    public User(ResourceManager rm) {
        this.rm = rm;
    }

    @Override
    public synchronized void notify(int val) {
        sum += val;
        notifyAll();
    }

    @Override
    public void run() {
        while (sum < 100) {
            rm.useResource(this);
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Use finished with sum: " + sum);

    }
}
