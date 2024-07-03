package JavaHTPE11.exam_practice.exams.b2021_98.Q4;

public class Main {
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

        for (int i = 0; i < 3; i++) {
            System.out.println("Num of use resource " + i + " :" + rp.getUseCount(i + 1));
        }

    }

}
