package JavaHTPE11.ClassLesson7_concurrency.ex9_wait_notifyAll;

public class TestMyMonitor {
    public static void main(String[] args) {
        MyMonitor mm = new MyMonitor();
        HeavyThread[] ht = new HeavyThread[10];

        for (int i = 0; i < ht.length; i++) {
            ht[i] = new HeavyThread(i, mm);
        }

        for (int i = ht.length - 1; i >= 0; i--) {
            ht[i].start();
        }
    }
}
