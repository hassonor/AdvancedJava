package JavaHTPE11.exam_practice.exams.a2018_83.Q4;

import JavaHTPE11.exam_practice.exams.b2021_98.Q4.Resource;

public class Worker extends Thread {
    private ResourcePool rp;

    public Worker(ResourcePool rp) {
        this.rp = rp;
    }

    @Override
    public void run() {
        Resource r = rp.getResource();
        System.out.println("Id: " + r.getId());
        r.use();
        rp.returnResource(r);
    }

}

