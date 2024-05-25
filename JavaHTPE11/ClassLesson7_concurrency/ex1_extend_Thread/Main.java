package JavaHTPE11.ClassLesson7_concurrency.ex1_extend_Thread;

public class Main {
    public static void main(String[] args) {
        OneToTwenty first = new OneToTwenty("FIRST");
        OneToTwenty second = new OneToTwenty("SECOND");
        OneToTwenty third = new OneToTwenty("THIRD");

        first.start();
        second.start();
        third.start();
        System.out.println("DONE");
    }
}
