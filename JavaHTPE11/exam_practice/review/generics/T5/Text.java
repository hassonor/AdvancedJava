package JavaHTPE11.exam_practice.review.generics.T5;

import JavaHTPE11.exam_practice.exams.a2022_27.Q3.NonCodeable;

public class Text implements Codeable<Text> {
    private String st = "";

    public Text(String st) {
        this.st = st;
    }

    @Override
    public Text code() throws NonCodeable {
        if (st.length() < 2)
            throw new NonCodeable();
        String str = "";
        str = st.charAt(st.length() - 1) + st.substring(0, st.length() - 1);

        return new Text(str);

    }
}
