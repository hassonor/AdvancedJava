package JavaHTPE11.ch_23_concurrency.exBook.ex_9_join;

public class Processes1 {
    public static void main(String[] args) {
        Name one = new Name("Amir");
        Name two = new Name("Or");
        Name three = new Name("Tamar");

        one.start();
        two.start();
        three.start();

        try {
            one.join();
            two.join();
            three.join();
        } catch (InterruptedException e) {
            System.out.println("main interrupter");
        }

        System.out.println("MAIN DONE");
    }
}
