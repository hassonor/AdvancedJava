package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion3;

class SharedCounter {
    private int counter = 0, maximum;
    private boolean printed = false;

    public SharedCounter(int maximum) {
        this.maximum = maximum;
    }

    public synchronized void increase() {
        counter++;
        notifyAll();
    }

    public synchronized void waitUntilCounterIsMaximum() {
        try {
            while (counter < maximum)
                wait();
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }

    }

    public synchronized void waitUntilPrint() {
        try {
            while (!printed)
                wait();
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }

    public synchronized void finishPrint() {
        printed = true;
        notifyAll();
    }


}