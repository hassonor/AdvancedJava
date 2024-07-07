package JavaHTPE11.exam_practice.review.concurrency.T2;


import JavaHTPE11.exam_practice.exams.a2023_88.Q4.firstWay.Data;

public class Storage {
    private final String[] strings;
    private final boolean[] encrypted;
    private int currentIndex, encryptedCount;

    public Storage(String[] strings) {
        this.strings = strings;
        this.encrypted = new boolean[strings.length];
    }

    public synchronized Data getData() {
        if (currentIndex >= strings.length)
            return null;
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
        if (encryptedCount == strings.length)
            notifyAll();
    }

    public synchronized String[] getResult() {
        while (encryptedCount < strings.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return strings;
    }

}
