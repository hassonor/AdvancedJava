package JavaHTPE11.exam_practice.review.concurrency.T13.A;

public class Bank {
    private double[] accounts;

    public Bank(int size, double initialBalance) {
        accounts = new double[size];
        for (int i = 0; i < size; i++) {
            accounts[i] = initialBalance;
        }
    }

    public synchronized boolean transfer(int from, int to, double amount) {
        while (accounts[from] < amount) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        accounts[from] = accounts[from] - amount;
        accounts[to] = accounts[to] + amount;
        notifyAll();
        return true;
    }

    public int size() {
        return accounts.length;
    }
}
