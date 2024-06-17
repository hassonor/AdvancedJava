package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion1;

public class Main {
    public static void main(String[] args) {
        Account ac = new Account(100);
        Cl c1 = new Cl(ac);
        Cl c2 = new Cl(ac);
        c2.start();
        c1.start();
    }

}
