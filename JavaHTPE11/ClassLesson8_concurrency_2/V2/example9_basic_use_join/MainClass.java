package JavaHTPE11.ClassLesson8_concurrency_2.V2.example9_basic_use_join;

public class MainClass {
    public static void main(String[] args) {
        TryThread first = new TryThread("A ", "a ", 50);
        TryThread second = new TryThread("B ", "b ", 30);
        TryThread third = new TryThread("C ", "c ", 50);
        first.start();
        second.start();
        third.start();
        try {
            first.join();
            second.join();
            third.join();
            //////////////////////////////////////////////
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("total =" + first.stamGetTotal() + "," + second.stamGetTotal() + "," + third.stamGetTotal());
    }
}