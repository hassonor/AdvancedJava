package JavaHTPE11.exam_practice.exams.a2024_89.Q1;

public class Code implements Cloneable {
    private char c1;
    private char c2;
    private char c3;

    public Code(char c1, char c2, char c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCode() {
        return "" + c1 + c2 + c3;
    }
}
