package JavaHTPE11.exam_practice.exams.b2018_93.Q4;

public class User extends Thread implements Notifyable {
    private ResourceManager rm;
    private int sum = 0;

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
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println("User finished with sum: " + sum);
    }
}

