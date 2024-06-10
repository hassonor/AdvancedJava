package JavaHTPE11.ClassLesson7_concurrency.V2.ex1_simple_thread;

public class TwoThreadsTest {
    public static void main(String[] args) {
        new SimpleThread("Jamaica").start();
        new SimpleThread("Fiji").start();
        SimpleThread t = new SimpleThread("stam SimpleThread.....");
        t.start();

    }
}

