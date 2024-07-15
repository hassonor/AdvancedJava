package JavaHTPE11.exam_practice.exams.a2024_94.Q3.A;


public class Sentence implements Flipable<Sentence> {
    private String[] strings;

    public Sentence(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i = 0; i < strings.length; i++) {
            if (i != strings.length - 1) {
                ans += strings[i] + " ";
            } else {
                ans += strings[i];
            }
        }
        return ans;
    }

    @Override
    public Sentence flip() {
        String[] rev = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            rev[i] = new String(strings[strings.length - 1 - i]);
        }

        return new Sentence(rev);
    }

}
