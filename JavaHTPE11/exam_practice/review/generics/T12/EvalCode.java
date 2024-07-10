package JavaHTPE11.exam_practice.review.generics.T12;

public class EvalCode extends Code implements Evaluateable {

    public EvalCode(String txt, int index) {
        super(txt, index);
    }

    @Override
    public int evaluate() {
        return getText().length() * 2;
    }

}
