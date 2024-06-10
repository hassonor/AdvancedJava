package JavaHTPE11.ClassLesson10.testQuestion4_concurrency.b;


/*
   Change the WorkThread, So the prints result by the thread num order,

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
