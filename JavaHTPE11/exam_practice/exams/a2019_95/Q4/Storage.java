package JavaHTPE11.exam_practice.exams.a2019_95.Q4;

public class Storage {
    private final Word[] words;
    private final boolean[] encrypted;
    private int currentIndex = 0;
    private int encryptedCount = 0;

    public Storage(Word[] words) {
        this.words = words;
        encrypted = new boolean[words.length];
    }

    public synchronized Word getWord() {
        if (currentIndex >= words.length)
            return null;
        Word word = new Word(currentIndex, words[currentIndex].getText());
        currentIndex++;
        return word;
    }

    public synchronized void setWord(Word word) {
        words[word.getPos()].setText(word.getText());
        if (!encrypted[word.getPos()]) {
            encrypted[word.getPos()] = true;
            encryptedCount++;
        }
        if (encryptedCount == words.length)
            notifyAll();
    }

    public synchronized Word[] getResult() {
        while (encryptedCount < words.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return words;
    }
}

