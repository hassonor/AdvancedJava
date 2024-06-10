package JavaHTPE11.ClassLesson8_concurrency_2.V2.example6_thread_with_flag;

public class MainClass {

    public static void main(String[] args) throws Exception {
        CounterThread thread = new CounterThread();
        thread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        //throw new Exception();
        thread.stopped = true;
        System.out.println("exit");
    }

}