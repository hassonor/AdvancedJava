package JavaHTPE11.exam_practice.exams.b2021_98.Q4;

public class Worker extends Thread {
    private ResourcePool rp;

    public Worker(ResourcePool rp) {
        this.rp = rp;
    }

    @Override
    public void run() {
        Resource r = rp.getResource();
        System.out.println("Resource id: " + r.getId());
        r.use();
        rp.returnResource(r);
    }

}
