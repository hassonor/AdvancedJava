package JavaHTPE11.exam_practice.exams.a2018_93.Q2;

public class Question {
    private String word;
    private String[] options;
    private String translation;

    public Question(String word, String[] options, String translation) {
        this.word = word;
        this.options = options;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public String[] getOptions() {
        return options;
    }

    public String getTranslation() {
        return translation;
    }
}