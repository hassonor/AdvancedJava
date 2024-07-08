package JavaHTPE11.exam_practice.exams.a2019_95.Q4;

import static java.net.URLEncoder.encode;

public class Coder extends Thread {
    private Storage s;

    public Coder(Storage s) {
        this.s = s;
    }

    @Override
    public void run() {
        Word word = s.getWord();
        while (word != null) {
            word.setText(encode(word.getText()));
            s.setWord(word);
            word = s.getWord();
        }
    }

}
