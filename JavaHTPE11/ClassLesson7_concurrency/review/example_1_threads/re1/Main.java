package JavaHTPE11.ClassLesson7_concurrency.review.example_1_threads.re1;

public class Main {
    public static void main(String[] args) {
        OneToTwenty one = new OneToTwenty("ONE");
        OneToTwenty two = new OneToTwenty("TWO");
        OneToTwenty three = new OneToTwenty("THREE");

        one.start();
        two.start();
        three.start();

        System.out.println("DONE");
    }
}
