package JavaHTPE11.exam_practice.exams.a2024_89.Q1;

public class SubCode extends Code {
    private Point p;

    public SubCode(char c1, char c2, char c3, Point p) {
        super(c1, c2, c3);
        this.p = p;
    }

    public Object clone() throws CloneNotSupportedException {
        SubCode c = (SubCode) super.clone();
        c.p = new Point(p.getX(), p.getY());
        return c;
    }
}
