package JavaHTPE11.exam_practice.review.generics.T23;


import JavaHTPE11.exam_practice.exams.a2018_83.Q3.Flipable;

public class Sentence implements Flipable<Sentence> {
    private String[] strings;

    public Sentence(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            if (i != strings.length - 1) {
                str = str + strings[i] + " ";
            } else {
                str = str + strings[i];
            }
        }

        return str;
    }

    @Override
    public Sentence flip() {
        String[] revStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            revStrings[i] = new String(strings[strings.length - 1 - i]);
        }

        return new Sentence(revStrings);
    }
}
