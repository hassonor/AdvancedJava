package JavaHTPE11.ClassLesson8_concurrency_2.V2.example5;

public class TestDaemon {


    public static void main(String[] args) {
        System.out.println("starting main thread....");
        StamThread tt1 = new StamThread();
//            tt1.setDaemon(true);
        tt1.start();
//            tt1.setDaemon(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("ending main thread....");

        for (int i = 0; i < 100; i++) {
            System.out.println("ending main thread....");
        }

    }
}        
        
       