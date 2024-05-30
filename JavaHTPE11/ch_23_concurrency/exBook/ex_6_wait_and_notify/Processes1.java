package JavaHTPE11.ch_23_concurrency.exBook.ex_6_wait_and_notify;

public class Processes1 {
    public static void main(String[] args) {
        Controller controller = new Controller(3);
        Name one = new Name("Amir", controller);
        Name two = new Name("Or", controller);
        Name three = new Name("Tamar", controller);

        one.start();
        two.start();
        three.start();
        controller.waitForThreads();
        System.out.println("MAIN DONE");
    }
}
