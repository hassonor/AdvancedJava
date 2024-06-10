package JavaHTPE11.ClassLesson8_concurrency_2.V2.example_10_deadlock;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("___________________");

        TryThread first = new TryThread("A ", "a ", 50L, null);
        TryThread second = new TryThread("B ", "b ", 30L, first);
        TryThread third = new TryThread("C ", "c ", 50L, second);
        first.next = third;
        Thread.sleep(2000);
        first.start();
        second.start();
        third.start();
        try {
            first.join();
            second.join();
            third.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("total =" + first.stamGetTotal() + second.stamGetTotal() + third.stamGetTotal());
    }
}