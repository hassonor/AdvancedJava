package JavaHTPE11.exam_practice.exams.a2022_24.Q1.B;


public class Group implements Cloneable {
    private Data data1;
    private Data data2;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Group g = (Group) super.clone();
        g.data1 = (Data) data1.clone();
        g.data2 = (Data) data2.clone();
        return g;
    }
}
