package JavaHTPE11.ClassLesson10.testQuestion4_concurrency.a;


/*
    1. The Workers will update the same array(vec) but not in parallel.
    2. If we remove the 'static' from the process method, all workers will work in parallel.
 */
public class Test {
    public static void main(String[] args) {
        int[] vec = {1, 2, 3, 4};
        WorkThread[] workers = new WorkThread[3];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new WorkThread(vec, i);

        }

        for (int i = 0; i < workers.length; i++) {
            workers[i].start();
        }

        System.out.println("**main**");
    }
}
