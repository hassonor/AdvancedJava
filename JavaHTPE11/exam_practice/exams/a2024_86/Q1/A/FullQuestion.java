package JavaHTPE11.exam_practice.exams.a2024_86.Q1.A;

public class FullQuestion extends Question {
    private String txt;

    public FullQuestion(String txt, String op) {
        super(txt);
        this.txt = op;
    }

    public String hint(Question m1) {
        return "FullQuestion: " + getTxt() + " " + " " + m1.getTxt() + " " + txt;
    }
}
