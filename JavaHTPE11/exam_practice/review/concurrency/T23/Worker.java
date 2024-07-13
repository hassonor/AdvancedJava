package JavaHTPE11.exam_practice.review.concurrency.T23;

public class Worker extends Thread {
    private ResourcePool rp;

    public Worker(ResourcePool rp) {
        this.rp = rp;
    }

    @Override
    public void run() {
        Resource r = rp.getResource();
        r.use();
        rp.returnResource(r);
    }


}
