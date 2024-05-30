package JavaHTPE11.ch_23_concurrency.exBook.ex_3_threads;

public class Name implements Runnable {

    static int counter = 0;
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " " + counter++);
        System.out.println(name + " " + counter++);
    }
}
