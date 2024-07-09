package JavaHTPE11.exam_practice.review.generics.T9;

public class Sentence implements Flippable<Sentence> {
    private String[] strings;

    public Sentence(String[] strings) {
        this.strings = strings;
    }


    @Override
    public Sentence flip() {
        String[] strRev = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            strRev[i] = new String(strings[strings.length - 1 - i]);
        }

        return new Sentence(strRev);
    }


}
