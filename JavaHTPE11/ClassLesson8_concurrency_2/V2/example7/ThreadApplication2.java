package JavaHTPE11.ClassLesson8_concurrency_2.V2.example7;//filename: ThreadApplication2.java


public class ThreadApplication2 {
    public static void main(String args[]) {
        Bilbi b1 = new Bilbi();
        Thread t1 = new Thread(b1);
        Bilbi b2 = new Bilbi();
        Thread t2 = new Thread(b2);
        t1.start();
        t2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        b1.stopThread();
        b2.stopThread();
        System.out.println("exit");
    }
}
 
 