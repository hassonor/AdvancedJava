package JavaHTPE11.exam_practice.exams.b2019_84.Q4;

public class Monitor {
    private int nextTurn = 1;
    private final int SIZE = 10;
    private int done = 0;

    public synchronized void print(int id, int num) {
        while (id >= nextTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("id=" + id + " num=" + num);
        nextTurn++;
        done++;
        notifyAll();
    }

    public synchronized void allDone() {
        while (done != SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
