package JavaHTPE11.exam_practice.exams.a2019_95.Q4;

public class Word {
    private String text;
    private int pos;

    public Word(int pos, String text) {
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

    public void setPos(int pos) {
        this.pos = pos;
    }
}
