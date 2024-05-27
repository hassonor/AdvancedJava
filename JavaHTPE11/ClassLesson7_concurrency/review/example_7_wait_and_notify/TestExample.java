package JavaHTPE11.ClassLesson7_concurrency.review.example_7_wait_and_notify;

public class TestExample {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        HeavyThread[] ht = new HeavyThread[10];

        for (int i = 0; i < ht.length; i++) {
            ht[i] = new HeavyThread(m, i);
        }

        for (int i = ht.length - 1; i >= 0; i--) {
            ht[i].start();
        }

    }
}
