package JavaHTPE11.exam_practice.review.concurrency.T23;

public class Test {
    public static void main(String[] args) {
        ResourcePool rp = new ResourcePool(3);
        Worker[] workers = new Worker[10];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(rp);
        }

        for (int i = 0; i < workers.length; i++) {
            workers[i].start();
        }

        for (int i = 0; i < workers.length; i++) {
            try {
                workers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i < 4; i++) {
            System.out.println(rp.getUseCount(i));
        }
    }
}
