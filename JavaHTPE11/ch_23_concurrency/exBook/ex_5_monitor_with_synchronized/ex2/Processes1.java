package JavaHTPE11.ch_23_concurrency.exBook.ex_5_monitor_with_synchronized.ex2;

public class Processes1 {
    public static void main(String[] args) {
        PrintMe printer = new PrintMe();
        Name one = new Name("Amir", printer);
        Name two = new Name("Or", printer);
        Name three = new Name("Tamar", printer);
        one.start();
        two.start();
        three.start();
        System.out.println("MAIN DONE");
    }
}
