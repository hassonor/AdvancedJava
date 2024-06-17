package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion1;

public class Cl extends Thread {
    Account _acc;

    public Cl(Account acc) {
        this._acc = acc;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            _acc.transaction((int) (Math.random() * 100) - 50);
            System.out.println(this.getName() + "==>" + i + ")" + _acc.getBalance());
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
