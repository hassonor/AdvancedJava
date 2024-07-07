package JavaHTPE11.exam_practice.exams.a2019_86.Q1;


public class App1 implements Applyable {
    private int num = 0;

    public void apply() {
        num++;
    }

    public void step(int n) {
        for (int i = 0; i < n; i++)
            apply();
    }

    public int getNum() {
        return num;
    }

    public boolean equals(App1 o) {
        System.out.print("in App1 ");
        if (!(o instanceof App1)) return false;
        return ((App1) o).num == num;
    }

    public String toString() {
        return "" + num;
    }
}