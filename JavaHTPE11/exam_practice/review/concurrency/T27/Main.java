package JavaHTPE11.exam_practice.review.concurrency.T27;

public class Main {
    public static void main(String[] args) {
        Monitor mon = new Monitor();
        for (int i = 0; i < 10; i++)
            new T(i, mon).start();
        System.out.println("finished");
    }
}
