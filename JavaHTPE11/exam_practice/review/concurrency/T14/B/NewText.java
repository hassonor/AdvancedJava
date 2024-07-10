package JavaHTPE11.exam_practice.review.concurrency.T14.B;


public class NewText {
    private String st;
    private int max;

    private boolean isDupTurn = true;

    public NewText(String st, int max) {
        this.max = max;
        if (st == null)
            this.st = "";
        else if (st.length() <= max)
            this.st = st;
        else
            this.st = st.substring(0, max);
    }

    public synchronized void dup() {
        while (!isDupTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        st = st + st;
        isDupTurn = false;
        notifyAll();
    }

    public synchronized void cut() {
        while (isDupTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        st = st.substring(0, st.length() / 2);
        isDupTurn = true;
        notifyAll();
    }
}

