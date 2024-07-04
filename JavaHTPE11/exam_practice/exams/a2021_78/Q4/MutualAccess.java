package JavaHTPE11.exam_practice.exams.a2021_78.Q4;

public class MutualAccess {
    private Semaphore semaphore = new Semaphore();
    private double[] dualData = new double[2];

    private class Semaphore {
        public static final int MAX_VALUE = 5;
        private int value = MAX_VALUE;

        public synchronized void down(int count) {
            while (value < count) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value = value - count;
        }

        public synchronized void up(int count) {
            value = value + count;
            notifyAll();
        }

    }

    public double readAverage() {
        semaphore.down(1);
        double average = (dualData[0] + dualData[1]) / 2;
        semaphore.up(1);
        return average;
    }

    public void write() {
        semaphore.down(Semaphore.MAX_VALUE);
        dualData[0] = Math.random();
        dualData[1] = Math.random();
        semaphore.up(Semaphore.MAX_VALUE);
    }

}
