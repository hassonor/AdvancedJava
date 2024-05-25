package JavaHTPE11.ClassLesson7_concurrency.ex5_sleep;

public class Main {
    public static void main(String[] args) {
        OneToTwenty first = new OneToTwenty("FIRST");
        OneToTwenty second = new OneToTwenty("SECOND");
        OneToTwenty third = new OneToTwenty("THIRD");

        first.start();
        second.start();
        third.start();

        try {
            first.join();
            second.join();
            third.join();

        } catch (InterruptedException e) {
            System.err.print(e.getMessage());
        }
        System.out.println("DONE");
    }
}
