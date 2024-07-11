package JavaHTPE11.ClassLesson8_concurrency_2.V2.testQuestion3;

public class ThreadArray {
    public static void main(String[] args) {
        final int N = 10;
        NumberThread[] threads = new NumberThread[N];
        SharedCounter sharedCounter = new SharedCounter(N);


        for (int i = 0; i < N; i++)
            threads[i] = new NumberThread(sharedCounter);

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

        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            maxVal = Math.max(maxVal, threads[i].getVal());
        }
        System.out.println("Maximum value: " + maxVal);

        //notify the threads that they can end
        sharedCounter.finishPrint();
    }
}



 