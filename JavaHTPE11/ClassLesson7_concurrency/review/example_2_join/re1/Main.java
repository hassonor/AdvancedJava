package JavaHTPE11.ClassLesson7_concurrency.review.example_2_join.re1;

public class Main {
    public static void main(String[] args) {
        OneToTwenty one = new OneToTwenty("ONE");
        OneToTwenty two = new OneToTwenty("TWO");
        OneToTwenty three = new OneToTwenty("THREE");

        one.start();
        two.start();
        three.start();


        try {
            one.join();
            two.join();
            three.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("DONE");
    }
}
