package JavaHTPE11.exam_practice.exams.b2020_73.Q3;

import JavaHTPE11.exam_practice.generics.testQuestion3.a.NonReduceable;

public class Text implements Reduceable<Text> {
    private String st = "";

    public Text(String st) {
        this.st = st;
    }

    @Override
    public Text reduce() throws NonReduceable {
        int index = st.indexOf(' ');
        if (index == -1)
            throw new NonReduceable();

        String str = "";
        str = st.substring(0, index) + st.substring(index + 1);

        return new Text(str);
    }

}