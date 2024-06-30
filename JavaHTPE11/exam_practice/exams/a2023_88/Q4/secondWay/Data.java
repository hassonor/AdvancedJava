package JavaHTPE11.exam_practice.exams.a2023_88.Q4.secondWay;

public class Data {
    private String text;
    private int pos;

    public Data(int pos, String text) {
        this.pos = pos;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPos() {
        return pos;
    }
}