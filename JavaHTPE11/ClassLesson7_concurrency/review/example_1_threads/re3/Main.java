package JavaHTPE11.ClassLesson7_concurrency.review.example_1_threads.re3;

public class Main {
    public static void main(String[] args) {
        OneToTwenty one = new OneToTwenty("ONE");
        OneToTwenty two = new OneToTwenty("TWO");
        OneToTwenty three = new OneToTwenty("THREE");

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);
        Thread t3 = new Thread(three);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("DONE");
    }
}
