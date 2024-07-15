package JavaHTPE11.exam_practice.exams.a2024_86.Q1.A;

public class Question {
    private String txt;

    public Question(String txt) {
        this.txt = txt;
    }

    public String getTxt() {
        return txt;
    }

    public String hint(Question m) {
        return "Question: " + txt + " " + m.txt;
    }
}
