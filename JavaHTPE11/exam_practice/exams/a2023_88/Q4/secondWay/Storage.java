package JavaHTPE11.exam_practice.exams.a2023_88.Q4.secondWay;

public class Storage {
    private final String[] strings;
    private final boolean[] encrypted;
    private int currentIndex;
    private int encryptedCount;

    public Storage(String[] strings) {
        this.strings = strings;
        this.encrypted = new boolean[strings.length];
        this.currentIndex = 0;
        this.encryptedCount = 0;
    }

    public synchronized Data getData() {
        if (currentIndex >= strings.length) {
            return null;
        }
        Data data = new Data(currentIndex, strings[currentIndex]);
        currentIndex++;
        return data;
    }

    public synchronized void setData(Data data) {
        strings[data.getPos()] = data.getText();
        if (!encrypted[data.getPos()]) {
            encrypted[data.getPos()] = true;
            encryptedCount++;
        }
        if (encryptedCount == strings.length) {
            notifyAll();
        }
    }

    public synchronized String[] getResult() {
        while (encryptedCount < strings.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted");
                return null;
            }
        }
        return strings;
    }
}