package JavaHTPE11.exam_practice.exams.a2021_91.Q1;

public class Conc implements Applyable {
    private int num;

    public Conc() {
    }

    public Conc(int num) throws Exception {
        if (num < 0 || num > 100)
            throw new Exception();
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public void apply() {
        num += 1;
    }

    public void calc() {
        num *= 2;
    }

    public boolean equals(Conc o) {
        if (!(o instanceof Conc)) return false;
        return ((Conc) o).num == num;
    }
}
