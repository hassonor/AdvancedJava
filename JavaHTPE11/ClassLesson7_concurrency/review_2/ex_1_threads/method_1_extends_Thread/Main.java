package JavaHTPE11.ClassLesson7_concurrency.review_2.ex_1_threads.method_1_extends_Thread;

public class Main {
    public static void main(String[] args) {
        OneToTwenty one = new OneToTwenty("ONE");
        OneToTwenty two = new OneToTwenty("TWO");
        OneToTwenty three = new OneToTwenty("THREE");

        one.start();
        two.start();
        three.start();
    }
}
