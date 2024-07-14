package JavaHTPE11.exam_practice.exams.b2018_83.Q4;

public class Manager {
    private int size;
    private int stepOneDone;
    private int nextTurn = 1;

    public Manager(int size) {
        this.size = size;
    }

    public void stage1(int num) {
        System.out.println("num=" + num + " stage1");
        synchronized (this) {
            stepOneDone++;
            if (stepOneDone == size)
                notifyAll();
        }
    }

    public synchronized void stage2(int num) {
        while (stepOneDone != size || num > nextTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("num=" + num + " stage2");
        nextTurn++;
        notifyAll();
    }

}
