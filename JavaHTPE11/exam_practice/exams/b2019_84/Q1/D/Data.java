package JavaHTPE11.exam_practice.exams.b2019_84.Q1.D;

public class Data {
    private int x;

    public Data(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        Data other = (Data) o;
        return x == other.x;
    }
}
