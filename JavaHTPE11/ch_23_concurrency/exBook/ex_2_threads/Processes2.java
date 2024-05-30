package JavaHTPE11.ch_23_concurrency.exBook.ex_2_threads;

public class Processes2 {
    public static void main(String[] args) {
        Name one = new Name("Amir");
        Name two = new Name("Or");
        Name three = new Name("Tamar");

        new Thread(one).start();
        new Thread(two).start();
        new Thread(three).start();
        System.out.println("MAIN DONE");
    }
}
