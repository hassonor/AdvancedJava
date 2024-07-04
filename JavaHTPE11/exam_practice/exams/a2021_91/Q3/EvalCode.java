package JavaHTPE11.exam_practice.exams.a2021_91.Q3;

public class EvalCode extends Code implements Evaluateable {


    public EvalCode(String txt, int index) {
        super(txt, index);
    }

    public int evaluate() {
        return (getText().length()) * 2;
    }
}
