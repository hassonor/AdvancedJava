package JavaHTPE11.ch_23_concurrency.exBook.monitor_with_synchronized.ex2;

public class Name extends Thread {
    static int counter = 0;
    private String name;

    private PrintMe printer;

    public Name(String name, PrintMe printer) {
        this.name = name;
        this.printer = printer;
    }

    public void run() {
        super.run();
        printer.print2(name);
    }

}
