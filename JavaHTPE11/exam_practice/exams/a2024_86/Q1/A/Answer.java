package JavaHTPE11.exam_practice.exams.a2024_86.Q1.A;

public class Answer extends Question {
    private String ans;

    public Answer(String txt, String ans) {
        super(txt);
        this.ans = ans;
    }

    public String getTxt() {
        return ans;
    }

    public String hint(Question m) {
        if (m instanceof Answer)
            return "Answer: " + getTxt();
        else return "Not Answer: " + m.getTxt();
    }
}
