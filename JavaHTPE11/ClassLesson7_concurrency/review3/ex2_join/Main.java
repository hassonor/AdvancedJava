package JavaHTPE11.ClassLesson7_concurrency.review3.ex2_join;

public class Main {
    public static void main(String[] args){
        Worker w1 = new Worker("ONE");
        Worker w2 = new Worker("TWO");
        Worker w3 = new Worker("THREE");

        w1.start();
        w2.start();
        w3.start();

        try{
            w1.join();
            w2.join();
            w3.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("DONE");
    }
}
