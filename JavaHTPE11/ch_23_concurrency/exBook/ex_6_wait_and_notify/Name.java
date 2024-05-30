package JavaHTPE11.ch_23_concurrency.exBook.ex_6_wait_and_notify;

public class Name extends Thread {
    static int counter = 0;
    private String name;
    private Controller controller;

    public Name(String name, Controller controller) {
        this.name = name;
        this.controller = controller;
    }

    @Override
    public void run() {
        System.out.println(name + " " + counter++);
        System.out.println(name + " " + counter++);
        controller.finished(); // notify controller I finished
    }
}
