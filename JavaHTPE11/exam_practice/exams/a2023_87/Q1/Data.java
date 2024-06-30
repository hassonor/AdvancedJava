package JavaHTPE11.exam_practice.exams.a2023_87.Q1;


public class Data implements MMM {
    private int num = 0;

    public void apply() {
        num++;
    }

    public void apply(int n) {

    }

    public boolean equals(Data o) {
        if (!(o instanceof Data)) return false;
        return ((Data) o).num == num;
    }

    public int getNum() {
        return num;
    }


}
