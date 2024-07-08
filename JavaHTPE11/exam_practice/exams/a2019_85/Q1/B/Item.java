package JavaHTPE11.exam_practice.exams.a2019_85.Q1.B;


public class Item implements Cloneable {
    private int a;
    private int b;

    public void setA(int num) {
        a = num;
    }

    public void setB(int num) {
        b = num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
