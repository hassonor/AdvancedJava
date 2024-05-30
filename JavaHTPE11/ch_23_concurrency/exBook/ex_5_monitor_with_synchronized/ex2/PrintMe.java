package JavaHTPE11.ch_23_concurrency.exBook.ex_5_monitor_with_synchronized.ex2;

public class PrintMe {
    public synchronized void print2(String str) {
        System.out.println(str + " " + Name.counter++);
        System.out.println(str + " " + Name.counter++);
    }
}
