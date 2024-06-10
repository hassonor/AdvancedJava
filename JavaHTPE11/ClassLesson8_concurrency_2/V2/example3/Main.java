package JavaHTPE11.ClassLesson8_concurrency_2.V2.example3;

public class Main {
    public static void main(String args[]) {
        Couples couple1 = new Couples("Popeye", "Olive", 500);
        Couples couple2 = new Couples("Kermit", "Ms. Piggy", 200);
        Couples couple3 = new Couples("Mickey", "Minnie", 1000);
        couple1.start();
        couple2.start();
        couple3.start();
//	      couple1.stop();
//	      couple1.destroy();
//          couple1.interrupt();
//	      couple1.suspend();


    }

}
