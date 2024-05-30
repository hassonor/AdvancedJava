package JavaHTPE11.ch_23_concurrency.exBook.ex_1_create_threads;

public class Name extends Thread {
    static int counter = 0;

    private volatile boolean finished = false;
    private String myName;

    public Name(String name) {
        myName = name;

    }

    public boolean isFinished() {
        return finished;
    }

    @Override
    public void run() {
        System.out.println(myName + " " + counter++);
        System.out.println(myName + " " + counter++);
        finished = true;
    }


}
