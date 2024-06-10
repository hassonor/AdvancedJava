package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion2;

public class Manager {
    private int[][] mat;

    private int sumOfMatrix = 0;

    private int current = 0;

    private int counterIndex = 0;

    public Manager(int[][] mat) {
        this.mat = mat;
    }

    public synchronized int[] allocateRow() {
        if (current == mat.length) return null;
        else {
            return mat[current++];
        }
    }

    public synchronized void addSum(int sum) {
        sumOfMatrix += sum;
        counterIndex++;
        notifyAll();

    }

    public synchronized int getTotal() {
        while (counterIndex != mat.length) {
            try {
                wait();
            } catch (InterruptedException exception) {
                System.err.println(exception.getMessage());
            }
        }
        return sumOfMatrix;
    }
}
