package JavaHTPE11.exam_practice.review.generics.T15;

import JavaHTPE11.exam_practice.exams.a2020_82.Q3.NonReverseable;

public class Text implements Reverseable<Text> {
    private String st = "";

    public Text(String st) {
        this.st = st;
    }

    @Override
    public Text reverse() throws NonReverseable {
        if (st.length() < 2)
            throw new NonReverseable();

        String rev = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            rev += st.charAt(i);
        }

        return new Text(rev);
    }
}
