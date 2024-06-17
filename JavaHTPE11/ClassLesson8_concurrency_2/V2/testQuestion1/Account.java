package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion1;

public class Account {
    private int balance = 0;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void transaction(int amount) {
        if (amount < 0) {
            while ((balance + amount) < 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }
        ///!!!?@#$%@%
        balance = balance + amount;
        notifyAll();


    }

    public int getBalance() {
        return balance;
    }
}
