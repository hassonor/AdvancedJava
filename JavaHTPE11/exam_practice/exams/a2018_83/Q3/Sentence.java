package JavaHTPE11.exam_practice.exams.a2018_83.Q3;

public class Sentence implements Flipable<Sentence> {
    private String[] strings;

    public Sentence(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        String st = "";
        for (int i = 0; i < strings.length; i++) {
            if (i != strings.length - 1)
                st = st + strings[i] + " ";
            else
                st = st + strings[i];
        }

        return st;
    }

    public Sentence flip() {
        String[] rev = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            rev[i] = new String(strings[strings.length - 1 - i]);
        }

        return new Sentence(rev);
    }

}
