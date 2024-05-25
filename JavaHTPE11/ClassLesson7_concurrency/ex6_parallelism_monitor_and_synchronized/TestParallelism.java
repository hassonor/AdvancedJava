package JavaHTPE11.ClassLesson7_concurrency.ex6_parallelism_monitor_and_synchronized;

public class TestParallelism {
    public static void main(String[] args) {
        CashRegister cr1 = new CashRegister();
        CashRegister cr2 = new CashRegister();
        CashRegister cr3 = new CashRegister();


        Teller teller1 = new Teller(cr1);


    }
}
