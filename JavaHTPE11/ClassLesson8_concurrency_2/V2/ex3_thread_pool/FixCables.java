package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex3_thread_pool;

public class FixCables extends Job {
    public void execute() {
        System.out.println("Start fixing cables");
        try {
            for (int i = 0; i < 100; ++i) {
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.err.println("Some kind of runtime exception occured in thread.sleep()");
            System.err.println(e);
        }
        System.out.println("Work done!");

    }
}