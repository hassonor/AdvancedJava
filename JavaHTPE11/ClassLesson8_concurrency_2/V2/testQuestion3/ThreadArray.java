package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion3;

public class ThreadArray {

    private final int N = 10;
    private NumberThread[] threads = new NumberThread[N];
    private SharedCounter sharedCounter = new SharedCounter(N);


    public void doIt() {

        for (int i = 0; i < N; i++)
            threads[i] = new NumberThread(i, sharedCounter);

        //setting neighbours
        for (int i = 0; i < N - 1; i++)
            threads[i].setNeighbour(threads[i + 1]);

        threads[N - 1].setNeighbour(threads[0]);


        //starting threads
        for (int i = 0; i < N; i++)
            threads[i].start();

        //wait for threads to change
        sharedCounter.waitUntilCounterIsMaximum();

        //printing after the change
        for (int i = 0; i < N; i++)
            System.out.print(threads[i] + ",");
        System.out.println();

        //notify the threads that they can end
        sharedCounter.finishPrint();
    }

    public static void main(String[] args) {
        (new ThreadArray()).doIt();
    }

}



 