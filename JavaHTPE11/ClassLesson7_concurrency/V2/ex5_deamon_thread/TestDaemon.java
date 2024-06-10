package JavaHTPE11.ClassLesson7_concurrency.V2.ex5_deamon_thread;

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
        
       