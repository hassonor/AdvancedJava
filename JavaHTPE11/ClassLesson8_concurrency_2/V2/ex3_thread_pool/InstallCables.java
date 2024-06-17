package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex3_thread_pool;

public class InstallCables extends Job {
    public void execute() {
        System.out.println("Start intalling cables");
        try {
            for (int i = 0; i < 100; ++i) {
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.err.println("Some kind of runtime exception occured in thread.sleep()");
            System.err.println(e);
        }
        System.out.println("Work done!");

    }
}