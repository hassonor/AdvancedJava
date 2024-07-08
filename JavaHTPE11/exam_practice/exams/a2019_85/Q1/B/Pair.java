package JavaHTPE11.exam_practice.exams.a2019_85.Q1.B;

public class Pair implements Cloneable {
    private Item item1;
    private Item item2;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pair p = (Pair) super.clone();
        p.item1 = (Item) item1.clone();
        p.item2 = (Item) item2.clone();
        return p;
    }
}
