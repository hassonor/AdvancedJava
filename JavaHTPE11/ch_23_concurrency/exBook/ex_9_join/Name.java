package JavaHTPE11.ch_23_concurrency.exBook.ex_9_join;

public class Name extends Thread {
    static int counter = 0;
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public void run() {
        super.run();
        System.out.println(name + " " + counter++);
        System.out.println(name + " " + counter++);
    }
}
