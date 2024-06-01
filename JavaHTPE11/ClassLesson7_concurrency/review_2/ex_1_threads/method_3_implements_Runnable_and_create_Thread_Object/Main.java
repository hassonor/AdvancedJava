package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_1_threads.method_3_implements_Runnable_and_create_Thread_Object;

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
    }
}
