package JavaHTPE11.exam_practice.review.concurrency.T27;

public class Monitor {
    private int nextTurn = 0;

    public synchronized void print(int id, int num) {
        while (id > nextTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("id=" + id + " num=" + num);
        nextTurn++;
        notifyAll();
    }
}
