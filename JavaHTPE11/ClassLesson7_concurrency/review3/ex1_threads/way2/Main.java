package JavaHTPE11.ClassLesson7_concurrency.review3.ex1_threads.way2;

public class Main {
    public static void main(String[] args){
        Worker w1 = new Worker("ONE");
        Worker w2 = new Worker("TWO");
        Worker w3 = new Worker("THREE");

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w3);

        t1.start();
        t2.start();
        t3.start();

        /* We can also write this instead
        new Thread(w1).start();
        new Thread(w2).start();
        new Thread(w3).start();
         **/

        System.out.println("DONE");
    }
}
