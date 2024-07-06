package JavaHTPE11.exam_practice.exams.a2020_moed_b.Q4;

public class NewText {
    private String st;
    private int max;
    private boolean dupTurn = true;


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
        while (!dupTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        st = st + st;
        dupTurn = false;
        notifyAll();
    }

    public synchronized void cut() {
        while (dupTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        st = st.substring(0, st.length() / 2);
        dupTurn = true;
        notifyAll();
    }

}
