package JavaHTPE11.exam_practice.exams.a2020_moed_b.Q4;

public class Text {
    private String st;
    private int max;

    public Text(String st, int max) {
        this.max = max;
        if (st == null)
            this.st = "";
        else if (st.length() <= max)
            this.st = st;
        else this.st = st.substring(0, max);
    }

    public synchronized void dup() {
        while (st.length() * 2 >= max) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        st = st + st;
    }

    public synchronized void cut() {
        st = st.substring(0, st.length() / 2);
        notifyAll();
    }

}
